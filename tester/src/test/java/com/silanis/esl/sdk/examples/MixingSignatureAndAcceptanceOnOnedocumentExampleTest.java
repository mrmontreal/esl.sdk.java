package com.silanis.esl.sdk.examples;

import com.silanis.esl.sdk.DocumentPackage;
import com.silanis.esl.sdk.Signature;
import com.silanis.esl.sdk.examples.notAllowed.MixingSignatureAndAcceptanceOnOnedocumentExample;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.silanis.esl.sdk.SignatureStyle.ACCEPTANCE;
import static com.silanis.esl.sdk.SignatureStyle.FULL_NAME;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by schoi on 1/21/15.
 */
public class MixingSignatureAndAcceptanceOnOnedocumentExampleTest {

    @Test (expected = com.silanis.esl.sdk.EslException.class)
    public void verifyResult() {
        MixingSignatureAndAcceptanceOnOnedocumentExample example = new MixingSignatureAndAcceptanceOnOnedocumentExample();
        example.run();

        DocumentPackage documentPackage = example.getRetrievedPackage();

        Collection<Signature> signatures = documentPackage.getDocument("First Document").getSignatures();
        List<Signature> signatureList = new ArrayList<Signature>(signatures);

        assertThat("Signatures not set correctly. ", signatureList.size(), is(2));
        assertThat("Signature not set correctly.", signatureList.get(0).getStyle(), is(FULL_NAME));
        assertThat("Acceptance not set correctly.", signatureList.get(1).getStyle(), is(ACCEPTANCE));
    }
}
