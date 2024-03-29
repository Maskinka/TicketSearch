# Задание 1. Поиск билетов

Вы работаете в сервисе по продаже авиабилетов онлайн.

![image](https://user-images.githubusercontent.com/53707586/154491051-0bc17b53-cf07-4502-80c0-6379e1a89b92.png)

Что вам нужно сделать:
1. Спроектируйте класс для информации о "Билете"*
1. Реализуйте репозиторий для хранения информации о "Билетах" (добавить, удалить, получить набор билетов)
1. Реализуйте менеджера поиска по аэропорту вылета и аэропорту прилёта (даты не учитывайте)

#### Информация о "Билете"

Класс информации о билете - это data-класс, который должен содержать:
1. id
1. Стоимость (для упрощения будем считать стоимость единой для всех продавцов)
1. Аэропорт вылета (вы можете использовать [IATA-коды](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%B4_%D0%B0%D1%8D%D1%80%D0%BE%D0%BF%D0%BE%D1%80%D1%82%D0%B0_%D0%98%D0%90%D0%A2%D0%90))
1. Аэропорт прилёта (вы можете использовать [IATA-коды](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%B4_%D0%B0%D1%8D%D1%80%D0%BE%D0%BF%D0%BE%D1%80%D1%82%D0%B0_%D0%98%D0%90%D0%A2%D0%90))
1. Время в пути (в минутах)

Других данных не нужно.

### Менеджер

В результате поиска возвращается массив только с теми билетами, что соответствуют условиям поиска. Результаты должны быть отсортированы по цене (от меньшей к большей).

### Автотесты

Напишите автотесты на поиск, удостоверившись, что он удовлетворяет условиям задачи. Количество тестов и тестируемые сценарии мы оставляем на ваше усмотрение.

# Задание 2. Самый быстрый

Иногда необходима сортировка не только по цене, а, например, по времени - люди хотят найти самый быстрый перелёт.
Но как мы это сделаем? Ведь наши "билеты" уже сортируются по цене?
Помимо интерфейса `Comparable`, который определяет порядок сортировки объектов данного класса по умолчанию, у нас есть интерфейс `Comparator`, который позволяет создавать объекты, определяющие порядок сортировки других объектов.
Если автотесты в ветке проходят - делаете Pull Request на слияние в основную ветку (сливать не нужно).
