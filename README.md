# Wisebits test project

Используемый стэк: Java 15 + Selenide + TestNg + Allure

Данная сборка тестировалась на MacOS Catalina version 10.15.4
По умолчанию используется браузер Google Chrome и предполагается что он установлен по умолчанию. Для тестирования в других браузерах потребуется их установка и возможно настройка системной переменной.

### Для запуска тестов выполните команду: 
- ```./gradlew clean test```
### Для показа репорта выполните последовательно команды:
- ```./gradlew allureReport```
- ```./gradlew allureServe```
### Кроссбраузерное тестирование
Для изменения браузера используется настройка ```systemProperties["selenide.browser"]``` в файле ```build.gradle``` . Можно указать например ```firefox``` , но этот бразуер должен быть установлен и возможно потребуется настройка системной переменной.
### Параллельный запуск тестов
Для паралелльного запуска тестов используется TestNg профиль ```src/test/resources/testng_profiles/amazon.xml```, в котором можно указать количество трэдов и что паралельно запускать тесты или сьюты.

### Общие комментарии
- При написании тестов были опущщены промежуточные ассерты(например на то что продукт есть в корзине или что он после его удаления корзина остается пустая)
- Основные проверки происходят посредством проверки нахождения нужного элемента и взаимодействия с ним, если что то пошло не так то тест упадет так как или мы перешли не туда или не смогли найти нужный элемент
- Также для упрощения используется допущение, что самый дешевый продукт в списке это первый продукт в списке после сортировки по цене



