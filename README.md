Construir imagem Docker:
```bash
docker build -t banking-accounts:latest .
```

Executar container Docker:
```bash
docker run -d -p 8080:8080 --name banking-accounts banking-accounts:latest
```

Criar repositorio ECR
```bash
aws cloudformation create-stack --stack-name banking-accounts-ecr-repository --template-body file://infra/ecr.repository.template.yaml
```

Atualizar repositorio ECR
```bash
aws cloudformation update-stack --stack-name banking-accounts-ecr-repository --template-body file://infra/ecr.repository.template.yaml
```

Eliminar repositorio ECR
```bash
aws cloudformation delete-stack --stack-name banking-accounts-ecr-repository
``` 

Criar cluster ECS:
```bash
aws cloudformation create-stack --stack-name tcc-ecs-cluster --template-body file://infra/ecs.cluster.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Eliminar cluster ECS:
```bash
aws cloudformation delete-stack --stack-name tcc-cluster
```

Criar serviço ECS
```bash
aws cloudformation create-stack --stack-name banking-accounts-ecs-service --template-body file://infra/ecs.service.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Atualizar serviço ECS
```bash
aws cloudformation update-stack --stack-name banking-accounts-ecs-service --template-body file://infra/ecs.service.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Eliminar serviço ECS
```bash
aws cloudformation delete-stack --stack-name banking-accounts-ecs-service
``` 

Criar OIDC para o Github Actions
```bash
aws cloudformation create-stack --stack-name banking-accounts-oidc-github-actions --template-body file://infra/iam.oidc.template.yaml --capabilities CAPABILITY_NAMED_IAM
```

Eliminar OIDC
```bash
aws cloudformation delete-stack --stack-name banking-accounts-oidc-github-actions
```