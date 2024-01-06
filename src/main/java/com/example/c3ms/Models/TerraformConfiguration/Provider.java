package com.example.c3ms.Models.TerraformConfiguration;

import com.example.c3ms.Models.TerraformConfiguration.Providers.Aws;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Provider {
    @Id
    String id;
    private Aws aws;
}
