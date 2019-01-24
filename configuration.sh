#!/bin/bash

case $1 in
    load )
        dialog --title "Setting for project" --clear --inputbox "MySQL username" -1 -1 2>/tmp/java_project_example
        response=$?
        case $response in
            0)
                answer=$(<"/tmp/java_project_example")
                mysql -u "$answer" -p -e "CREATE DATABASE phonebook;"
                mysql -u "$answer" -p phonebook < phonebook.sql
            ;;
        esac
        rm /tmp/java_project_example
    ;;
    save )
        dialog --title "Setting for project" --clear --inputbox "MySQL username" -1 -1 2>/tmp/java_project_example
        response=$?
        case $response in
            0)
                username=$(<"/tmp/java_project_example")
                mysqldump --opt phonebook -u"$username" -p > phonebook.sql
            ;;
        esac
        rm /tmp/java_project_example
    ;;
    jar )
        gradle build
    ;;
    run )
        java -jar build/libs/java_project_example.jar
    ;;
    * )

    ;;
esac