# Notifications API

**NotificationsAPI - это RESTful API для отправки уведомлений.**

## Установка и запуск

1. Клонируйте репозиторий:

```bash
git clone https://github.com/un1soon/NotificationsAPI.git
```

2. Запустите сборку jar файлов

```bash
mvn clean
mvn package
```

3. Запустите сборку проекта через docker compose

```bash
docker compose up
```

# Использование API

## Отправка уведомлений

### POST /email

Отправляет email

**Пример ответа**

````json
{
    "message": "email was sent",
    "timestamp": "2023-11-20T11:52:52.861716388"
}
````

### POST /sms

Отправляет sms

**Пример ответа**

````json
{
    "message": "sms was sent",
    "timestamp": "2023-11-20T11:52:52.861716388"
}
````

### POST /push

Отправляет push

**Пример ответа**

````json
{
    "message": "push was sent",
    "timestamp": "2023-11-20T11:52:52.861716388"
}
````

# Ошибки API

- 404 Not Found - ресурс не найден
- 503 Service Unavailable - возникает при попытке запросов к API во время регистрации микросервисов через Gateway
