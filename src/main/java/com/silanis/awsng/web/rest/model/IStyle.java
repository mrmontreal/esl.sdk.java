package com.silanis.awsng.web.rest.model;
//
import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.ArrayList;
import com.silanis.awsng.web.rest.util.SchemaSanitizer;
public interface IStyle {
    public IStyle setBackgroundColor( String value);
    public String getBackgroundColor();
    public IStyle setColor( String value);
    public String getColor();
    }