# mybatis-generator
Mybatis 逆向工程脚手架

更多项目关注：https://github.com/itzhouq

## 使用说明

该脚手架主要借助 mybatis 逆向工程生成实体类、相关接口和对应 mapper 文件，提高开发效率。该文件为使用说明。

### 1. 修改数据库

- 将数据库连接修改为自己的数据库

application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/actionsys?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai
spring.datasource.username=root
spring.datasource.password=232323
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
```

### 2. 修改数据表和实体类名称
- 修改 mybatis-generator-config.xml 的 `<table>` 配置。注释或者删除不需要生成的表，添加需要的表
```xml
<table schema="" tableName="t_user" domainObjectName="User"
   enableCountByExample="false" enableDeleteByExample="false" enableSelectByExample="false"
   enableUpdateByExample="false" selectByExampleQueryId="false">
<!--是否使用实际列名,默认为false-->
<!--<property name="useActualColumnNames" value="false" />-->
</table>
```

### 3. 生成实体类和 mapper 文件

- 修改配置确认无误后，运行 mybatis-generator 插件。

![](https://gitee.com/itzhouq/images/raw/master/notes/20200713220114.png)

### 4. 注意
- 如果生成失败了，修改相关参数可以再次尝试生成。但是第一次生成的 Java 文件会被覆盖，但是 xml 文件需要手动删除。该配置可以在 pom.xml 文件中修改。
```xml
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.7</version>
    <configuration>
        <!--mybatis的代码生成器的配置文件-->
        <configurationFile>src/main/resources/mybatis-generator-config.xml</configurationFile>
        <!--允许覆盖生成的文件-->
        <overwrite>true</overwrite>
        <!--将当前pom的依赖项添加到生成器的类路径中-->
        <!--<includeCompileDependencies>true</includeCompileDependencies>-->
    </configuration>
    <dependencies>
        <!--mybatis-generator插件的依赖包-->
        <!--<dependency>-->
        <!--<groupId>org.mybatis.generator</groupId>-->
        <!--<artifactId>mybatis-generator-core</artifactId>-->
        <!--<version>1.3.7</version>-->
        <!--</dependency>-->
        <!-- mysql的JDBC驱动 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.17</version>
        </dependency>
    </dependencies>
</plugin>
```

- 遇到问题，注意看报错信息，阅读 mybatis-generator-config.xml 文件的注释，必要时参考官网。

### 5. 文件的使用
- 如果需要将生成的 Java 文件和 Mapper 文件移动到别的项目中使用，注意修改 Java 文件的包名，这个编辑器会提示，一般不会忘记。**但是 Mapper 的 namespace 编辑器不会提示错误，这点尤其注意**。





