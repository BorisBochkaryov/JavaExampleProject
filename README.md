Пример проекта на Java (Spring Boot + JDBC/MySQL + AngularJS + Bootstrap3)
============================

Данный проект предназначен для примера связки Spring Boot (backend) и AngularJS (frontend)

### Использование _configuration.sh_
Для работы с проектом реализован скрипт, поддерживающий основные действия:
- развернуть БД из дампа
```bash
    ./configuration.sh load
```
- сохранить БД в файл _phonebook.sql_
```bash
    ./configuration.sh save
```
- собрать проект
```bash
    ./configuration.sh jar
```
- запустить проект
```bash
    ./configuration.sh run
```
По умолчанию запускается на порту [**:8888**](http://localhost:8888/).