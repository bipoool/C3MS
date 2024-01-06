package com.example.c3ms.Repositories;

import com.example.c3ms.Models.TerraformConfiguration.TerraformConfigurations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TerraformConfigurationRepo extends MongoRepository<TerraformConfigurations, String> {
}
