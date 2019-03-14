springboot连接mybatis第一版demo

1，按照自己的数据库连接信息改变application.yml中的配置
2，使用t_user.sql中的语句创建表和新增数据
3，启动DemoApplication类
4，按照DemoApplication类上的注释查询数据，和查看druid监控(http://127.0.0.1:8080/druid)
5，使用http://localhost:8080/monitoring查看javaMelody监控           （添加@MonitoredWithSpring注解，针对方法进行监控）