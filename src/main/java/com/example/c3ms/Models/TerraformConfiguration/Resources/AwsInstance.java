package com.example.c3ms.Models.TerraformConfiguration.Resources;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
@Getter
@Setter
public class AwsInstance{
    public String ami;
    public String instance_type;
    public HashMap<String, String> tags;
}

