The application asks the user for the following data:
Last name, first name, patronymic, date of birth, phone number, gender.

Data formats:
Last name, first name, patronymic - strings

Birthdate - format string dd.mm.yyyy

Phone_number - unsigned integer without formatting

Gender - Character f or m.

The application parses the received values and extracts the required parameters from them.
If the data formats do not match, an exception is thrown corresponding to the type of problem.

It is Used the built-in java exception types and created own with a parent class PersonBuilderException, which is inherited
from RuntimeException. A message is displayed to the user with information from the triggered exception, what exactly was entered incorrectly.

If everything is entered and processed correctly, a file with a name equal to the last name is created in the data.persons folder.
It contains the received data in one line, of the form <Surname><Name><Patronymic><date of birth> <telephone number><gender>

Persons with same last names are recorded in the same file, in separate lines.

If there is a problem with reading/writing to a file, the exception is handled and the error stacktrace is passed to the user.


Рис.1. Addition / Добавление.

![add1](https://user-images.githubusercontent.com/36072345/234845584-62671d49-ca5d-42f5-9dd7-2fe6708d2c85.JPG)


Рис2. Exception / Срабатывание исключения.

![Exc1](https://user-images.githubusercontent.com/36072345/234845693-240b39ab-7b80-4e85-b332-e3780528dae8.JPG)

Приложение запрашивает у пользователя следующие данные:
Фамилия, Имя, Отчество, дата рождения, номер телефона, пол.

Форматы данных:
фамилия, имя, отчество - строки

Дата_рождения - строка формата dd.mm.yyyy

Номер_телефона - целое беззнаковое число без форматирования

Пол - символ латиницей f или m.

Приложение распарсивает полученные значения и выделяет из них требуемые параметры.
Если форматы данных не совпадают, бросается исключение, соответствующее типу проблемы.

Использованы встроенные типы исключений java и созданы свои с общим предком PersonBuilderException, который наследуется
от RuntimeException. Пользователю выводится сообщение с информацией из сработавшего исключения, что именно неверно введено.

Если всё введено и обработано верно, создаётся файл с названием, равным фамилии, в папке data.persons.
В него в одну строку записываются полученные данные, вида <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы записываются в один и тот же файл, в отдельные строки.

При возникновении проблемы с чтением-записью в файл, исключение обрабатывается и пользователю передается стектрейс ошибки.
