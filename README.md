```sequence
participant HW
participant Pipelie
participant Scheduler
participant Job
participant Executor
participant Agent
participant Watcher
participant MessageQueue
participant Zookeeper
Note over 客户端: 用户输入通行证的账号、密码
客户端->通行证中心: 发送账号、密码
Note over 通行证中心: 验证账号、密码
通行证中心-->>客户端: 返回token
客户端->服务器: 发送token
服务器->通行证中心: 验证token
通行证中心-->>服务器: 验证成功
服务器-->>客户端: 登陆成功
客户端-->>通行证中心: success
```
