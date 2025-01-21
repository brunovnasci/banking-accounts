Construir imagem Docker:
```bash
docker build -t banking-accounts:latest .
```

Executar container Docker:
```bash
docker run -d -p 8080:8080 --name banking-accounts banking-accounts:latest
```

Criar cluster ECS:
```bash
aws cloudformation create-stack --stack-name tcc-cluster --template-body file://ecs/cluster.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Eliminar cluster ECS:
```bash
aws cloudformation delete-stack --stack-name tcc-cluster
```

Registrar ECS Task Definition
```bash
aws cloudformation create-stack --stack-name banking-accounts-task-definition --template-body file://ecs/task-definition.template.yaml
```

Atualizar ECS Task Definition
```bash
aws cloudformation update-stack --stack-name banking-accounts-task-definition --template-body file://ecs/task-definition.template.yaml
```

Eliminar ECS Task Definition
```bash
aws cloudformation delete-stack --stack-name banking-accounts-task-definition
```

Criar ECS task role
```bash
aws cloudformation create-stack --stack-name banking-accounts-task-role --template-body file://ecs/task-role.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Eliminar ECS task role
```bash
aws cloudformation delete-stack --stack-name banking-accounts-task-role
```

Criar serviço ECS
```bash
aws cloudformation create-stack --stack-name banking-accounts-service --template-body file://ecs/service.template.yaml
```

Atualizar serviço ECS
```bash
aws cloudformation update-stack --stack-name banking-accounts-service --template-body file://ecs/service.template.yaml
```

Eliminar serviço ECS
```bash
aws cloudformation delete-stack --stack-name banking-accounts-service
``` 