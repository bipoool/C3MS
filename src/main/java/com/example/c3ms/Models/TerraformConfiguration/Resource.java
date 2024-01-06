package com.example.c3ms.Models.TerraformConfiguration;

import com.example.c3ms.Models.TerraformConfiguration.Resources.AwsInstance;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
@Getter
@Setter
public class Resource {
    private HashMap<String, AwsInstance> aws_instance;
}
