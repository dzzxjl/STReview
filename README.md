# ssm
Spring + Spring MVC + MyBatis

***
今天修复了两个惊天大BUG，真的是非常666,
* tomcat+idea控制台显示中文乱码
  * 一律显示???，但是信息没丢失，此时应该将问题准确定位到非mysql+mybatis的问题上面
* Spring返回中文数据乱码
  * spring responsebody采用iso编码，无中文显示，添加bean——修改为utf-8的bean

**今天这两个问题交杂在一起，真的是神烦，还是要学会准确定位问题！**
