# mybatis-generator
Mybatis 逆向工程脚手架

更多项目关注：https://github.com/itzhouq

## 使用说明

该脚手架主要借助 mybatis 逆向工程生成实体类、相关接口和对应 mapper 文件，提高开发效率。该文件为使用说明。

### 1. 修改数据库

- 将数据库连接修改为自己的数据库

application.properties

```xml
<!--数据库链接URL，用户名、密码 -->
<jdbcConnection driverClass="com.mysql.jdbc.Driver"
                connectionURL="jdbc:mysql://localhost:3306/lottery?useUnicode=true&amp;autoReconnect=true&amp;rewriteBatchedStatements=TRUE"
                userId="root" password="123456">
</jdbcConnection>
```

### 2. 修改数据表和实体类名称
- 修改 mybatis-generator-config.xml 的 `<table>` 配置。注释或者删除不需要生成的表，添加需要的表
```xml
<table schema="" tableName="activity" domainObjectName="Activity"
   enableCountByExample="false" enableDeleteByExample="false" enableSelectByExample="false"
   enableUpdateByExample="false" selectByExampleQueryId="false">
<!--是否使用实际列名,默认为false-->
<!--<property name="useActualColumnNames" value="false" />-->
</table>
```

### 3. 生成实体类和 mapper 文件
- 运行 MybatisGenerator 的 main 方法。
- MyCommentGenerator 会根据表注释生成实体类注释
- mybatis-generator-lombok-plugin 插件会基于lombok生成@Data注解而不是setter/getter方法


