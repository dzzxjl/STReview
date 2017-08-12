# STReview——Sparrow Technology Review Edit

***
### 麻雀理工科技评论
> 提供科技圈最新信息，网站虽小，信息很全

### 数据源
* 虎嗅网
* ifanr

### 技术栈
* 前端 element
* 后端 Spring+Spring MVC+MyBatis
* 数据抓取 scrapy

### 数据表设计
* 文章表
  * 文章ID
  * 文章标题
  * 文章内容
  * 文章作者
  * 文章来源(1,2,3)
  * 文章链接
* 评论表
  * 评论ID
  * 评论内容
  * 评论人ID
  * 评论时间
  * 文章ID 外键
* 用户表
  * 用户ID
  * username
  * password

###Debug
* 现在项目使用的是java web项目方式，即先启动tomcat，tomcat加载项目主页并进行拦截
以及启动Spring操作
  如何将项目改成Spring启动，使用内嵌tomcat服务器的方式来启动项目主页


今天修复了两个惊天大BUG，真的是非常666,
* tomcat+idea控制台显示中文乱码
  * 一律显示???，但是信息没丢失，此时应该将问题准确定位到非mysql+mybatis的问题上面
* Spring返回中文数据乱码
  * spring responsebody采用iso编码，无中文显示，添加bean——修改为utf-8的bean
* 今天这两个问题交杂在一起，真的是神烦，还是要学会准确定位问题！

###项目更新记录
* 8.12 element搭建出现问题，先维护后端，前端临时使用jstl进行渲染
* 
