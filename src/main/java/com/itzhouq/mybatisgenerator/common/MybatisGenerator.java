package com.itzhouq.mybatisgenerator.common;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author itzhouq
 * @date 6/27/22 22:59
 */
public class MybatisGenerator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);

        File configFile = new File("src/main/resources/mybatis-generator-config.xml");
        Configuration config = cp.parseConfiguration(configFile);

        DefaultShellCallback callback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
