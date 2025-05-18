# SI_2025_lab2_233013

Втора лабараториска вежба по Софтверско инженерство

Тамара Мурџоска, бр. на индекс 233013

Control Flow Graph

![Фотографија од control flow graph-ot](images/CFGDiagram.svg)

![Фотографија од control flow graph-ot - objasnuvanje na brojkite od dijagramot spored liniite vo kodot](images/objasnuvanje.jpg)

Цикломатска комплексност

Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1. Во овој код имаме 6 if услови, и 2 for циклуси. Според формулата добиваме 8+1 = 9.

Every statement

Тест 1:allitems==null card number=1234567812345678

Teст 2:allitems = [item(name = "", qunatity=4, price = 100, discount = 0 )] card number = 1234567812345678

Тест 3:allitems = [item(name = "item", qunatity=40, price = 400, discount = 0.5 )] card number = 123456781234567812344

Тест 4:allitems = [item(name = "item", qunatity=40, price = 400, discount = 0 )] card number = 12vfeg3456yt6123

Тест 5:allitems = [item(name = "item", qunatity=40, price = 400, discount = 0 )] card number = 1234567812345678

![Excel tabela](images/test.png)

Multiple Condition

Услов:
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

Тест 1: Item("item", 2,500, 0)
price =true, quantity=false, discount= false => vleguva vo if

Тест 2:Item ("item", 2, 200, 0.5)
price = false, quantity = false, discount= true => vleguva vo if

Тест 3:Item ("item", 15, 200, 0)
price = false, quantity = true, discount = false => vleguva vo if

Тест 4: Item ("item", 2, 200, 0)
price, quantity, discount = false =>odi vo else


Објаснување на unit тестовите:

Every statement:
Се користат 5 различни тест случаи за да можат сите тие заедно да ги опфатат сите линии во методот checkCart, односно ни обезбедуваат дека секоја линија код е извршена барем еднаш.

Тест 1 ни го опфаќа првиот if,каде што фрла throw - allItems list can't be null

Тест 2 ни ги опфаќа фор циклусот и ифот во него, каде што ни фрла throw "Invalid item!"

Teст 3 ни ги опфаќа другите 2 ифови во фор циклусот и оди долу до else-от каде што фрла throw Invalid card number!

Тест 4 ни ги опфаќа else-от во фор циклусот како и ифот надвор од фор циклусот и ни фрла throw Invalid character in card number!

Тест 5 ни поминува без грешка и оди долу до return sum

Multiple Condition:
Се користат 4 различни тест случаи, каде што во првите три задоволуваме само еден услов од бараните 3 и бидејќи е или услов, влегуваме во ифот, а во четвртиот тест случај сите ни се false па не влегуваме во ифот

