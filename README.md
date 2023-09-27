# ECDICT API

基于 [ECDICT](ECDICT) 的词典 API。

### 运行环境

- JDK 17
- MySQL 8

### 部署步骤

#### 本地部署

1. 将 `et.sql` 导入数据库;
2. 修改 `application.properties` 中的数据库连接信息;
3. 编译项目并运行: `mvn clean package && java -jar target/et-api-0.0.1-SNAPSHOT.jar`
4. 访问 `http://localhost:8080/api/words/hello` 即可

#### Railway

1. 将 `et.sql` 导入数据库;
2. 修改 `application.properties` 中的数据库连接信息;
3. 提交项目到 GitHub;
4. 在 Railway 上创建一个新的应用，选择 GitHub 作为部署源，选择刚才提交的项目;
5. 等待部署完成，访问 `https://<your-app-name>.railway.app/api/words/hello` (在 `Settings` - `Public Network` 中指定)即可
# ecdict-api
