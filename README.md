# Автоматизация управления и тестирования для веб-сайтов при помощи протокола удалённого доступа Google Chrome

## Особенности

- Отображение видимых элементов на веб-странице
- Отображение кликабельных элементов на веб-странице
- Настройка поведения инструмента с помощью параметров командной строки
- Возможность кликнуть на элемент, ввести текст в поле ввода и перейти по ссылке
- Выполнение команд для перехода вперед, назад и обновления страницы
- Пагинация и фильтрация выводимых элементов
- Исполнение JS скриптов во вреям работы программы

## Использование

Для использования утилиты скомпилируйте и запустите файл `PlaywrightMain.java` с соответствующими параметрами командной строки.

Параметры командной строки:
- `-l`: Устанавливает URL для перехода (например, `-l=https://example.com`)
- `-v`: Переключает отображение видимых элементов на веб-странице. По умолчанию: **отключено**.
- `-c`: Переключает отображение кликабельных элементов на веб-странице. По умолчанию: **отключено**.
- `-a`: Переключает возможность предложения пользователю кликнуть по элементу или ввести команду. По умолчанию: **включено**.
- `-dom`: Переключает вывод DOM страницы. По умолчанию: **включено**.

Пример:

```
java PlaywrightMain -l=https://example.com -v -c -a
```

Эта команда запустит утилиту с указанными параметрами:

- URL для перехода: `https://example.com`
- Отображение видимых элементов: включено
- Отображение кликабельных элементов: включено
- Предложение пользователю кликнуть по элементу: включено

Утилита будет выводить информацию о видимых и кликабельных элементах на веб-странице и предложит пользователю кликнуть по одному из них.
Во время использования программы вводите индексы элементов (Clickable elements) чтобы взаимодействовать с ними.
При выборе поля `input` Вам будет предложено ввести текст который нужно вписать в это поле.

### Команды во время использования программы
- `-v`: Переключает отображение видимых элементов на веб-странице.
- `-c`: Переключает отображение кликабельных элементов на веб-странице.
- `-a`: Переключает возможность предложения пользователю кликнуть по элементу.
- `-back`: Переходит на предыдущую страницу.
- `-next`: Переходит на следующую страницу.
- `-reload`: Обновляет текущую страницу.
- `-vn`: Переходит на следующую страницу видимых элементов.
- `-vp`: Переходит на предыдущую страницу видимых элементов.
- `-vpage={x}`: Переходит на страницу x видимых элементов, где x - номер страницы.
- `-ve={x}`: Устанавливает количество элементов на странице (elements per page), где x - число обозначающее сколько элементов на странице нужно отображать.
- `-ci`: Отображает только input-элементы из списка кликабельных элементов.
- `-cb`: Отображает только кнопки из списка кликабельных элементов.
- `-cl`: Отображает только ссылки из списка кликабельных элементов.
- `-co`: Отображает только элементы типа "other" из списка кликабельных элементов.
- `-ca`: Отображает все кликабельные элементы на веб-странице.
- `-js={scriptName.js}`: Исполняет JS скрипт на текущей странице. Скрипт должен находиться в папке resources. Например: -js=temp.js.

____________________________________________________________________________________________________

# Automation of Management and Testing for Websites Using the Google Chrome Remote Debugging Protocol

## Features

- Display visible elements on a web page
- Display clickable elements on a web page
- Configure tool behavior using command-line parameters
- Ability to click on an element, enter text into an input field, and navigate through links
- Execute commands to navigate forward, backward, and refresh the page
- Pagination and filtering of displayed elements
- Execute JavaScript scripts during program execution

## Usage

To use the utility, compile and run the `PlaywrightMain.java` file with the appropriate command-line parameters.

Command-line parameters:
- `-l`: Sets the URL to navigate to (e.g., `-l=https://example.com`)
- `-v`: Toggles the display of visible elements on the web page. Default: **disabled**.
- `-c`: Toggles the display of clickable elements on the web page. Default: **disabled**.
- `-a`: Toggles the ability to prompt the user to click on an element or enter a command. Default: **enabled**.
- `-dom`: Toggles the display of the web page's DOM. Default: **enabled**.

Example:

```
java PlaywrightMain -l=https://example.com -v -c -a
```

This command will launch the utility with the specified parameters:

- URL to navigate to: `https://example.com`
- Display of visible elements: enabled
- Display of clickable elements: enabled
- Prompting the user to click on an element: enabled

The utility will display information about visible and clickable elements on the web page and prompt the user to click on one of them.
During program usage, input the indexes of clickable elements to interact with them.
When selecting an input field, you will be prompted to enter the text to be typed into that field.

### Commands during Program Usage
- `-v`: Toggles the display of visible elements on the web page.
- `-c`: Toggles the display of clickable elements on the web page.
- `-a`: Toggles the ability to prompt the user to click on an element.
- `-back`: Navigates to the previous page.
- `-next`: Navigates to the next page.
- `-reload`: Refreshes the current page.
- `-vn`: Goes to the next page of visible elements.
- `-vp`: Goes to the previous page of visible elements.
- `-vpage={x}`: Goes to page x of visible elements, where x is the page number.
- `-ve={x}`: Sets the number of elements per page, where x is the number of elements to display per page.
- `-ci`: Displays only input elements from the list of clickable elements.
- `-cb`: Displays only buttons from the list of clickable elements.
- `-cl`: Displays only links from the list of clickable elements.
- `-co`: Displays only "other" type elements from the list of clickable elements.
- `-ca`: Displays all clickable elements on the web page.
- `-js={scriptName.js}`: Executes a JS script on the current page. The script should be located in the resources folder. For example: `-js=temp.js`.
