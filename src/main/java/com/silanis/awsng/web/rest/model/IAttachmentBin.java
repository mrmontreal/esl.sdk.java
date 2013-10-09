package com.silanis.awsng.web.rest.model;
//
import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.silanis.awsng.web.rest.util.JsonDateDeserializer;
import com.silanis.awsng.web.rest.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.silanis.awsng.web.rest.util.SchemaSanitizer;
public interface IAttachmentBin {
    public IAttachmentBin setAttachmentUid( String value);
    public String getAttachmentUid();
    public IAttachmentBin setData( Map<String, Object> value);
    public Map<String, Object> getData();
    public IAttachmentBin setId( String value);
    public String getId();
    public IAttachmentBin setInsertDate( java.util.Date value);
    public java.util.Date getInsertDate();
    public IAttachmentBin setName( String value);
    public String getName();
    }