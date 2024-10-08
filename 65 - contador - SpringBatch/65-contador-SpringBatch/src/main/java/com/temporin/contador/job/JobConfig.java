package com.temporin.contador.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class JobConfig {

  @Autowired
  private JobBuilderFactory jobBuilderFactory;

  @Bean
  public Job job(@Qualifier("step1") Step step1, @Qualifier("step2") Step step2) {
    return jobBuilderFactory
        .get("job")
        .start(step1)
        .next(step2)
        .build();
  }
}