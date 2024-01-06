package com.example.c3ms.Models.TerraformConfiguration.Providers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Getter
@Setter
public class Aws {
    public String region;
    public String profile;
    public ArrayList<String> shared_credentials_files;
}
