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

Criar serviço ECS
```bash
aws cloudformation create-stack --stack-name banking-accounts-service --template-body file://ecs/service.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Atualizar serviço ECS
```bash
aws cloudformation update-stack --stack-name banking-accounts-service --template-body file://ecs/service.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Eliminar serviço ECS
```bash
aws cloudformation delete-stack --stack-name banking-accounts-service
``` 