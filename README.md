RO: Programare Java - laborator 2, cerințe de rezolvat: 



1. Fișierul judete_in.txt, conține lista neordonată a județelor din țară. Să se încarce datele din fișier într-un tablou de String-uri și să se ordoneze acest tablou cu ajutorul metodei sort() din clasa Arrays. Să se returneze pe ce poziție se află în vectorul ordonat un județ introdus de la tastatură. Se va utiliza metoda de căutare binară din clasa Arrays. 

2. Fișierul cantec_in.txt conține versurile unui cântec la alegere. Să se scrie un program care creează fișierul cantec_out.txt, care conține versurile cântecului original dar în plus în dreptul fiecărui rând sunt afișate numărul de cuvinte de pe rând şi numărul de vocale de pe fiecare rând. În dreptul rândurilor care se încheie cu o grupare de litere aleasă se va pune o steluță (*). Rândurile pentru care un număr generat aleator este mai mic decât 0.1 vor fi scrise cu majuscule (se vor genera aleator numere între 0 şi 1). Se va defini o clasă Vers, care are o variabilă membră privată un șir de caractere reprezentând versul și se va dezvolta câte un operator pentru fiecare cerință de mai sus (o metodă care returnează numărul de cuvinte, o metodă care returnează numărul de vocale, etc). Se va crea un vector de obiecte de tip Vers care va conține informația preluată din fișierul de intrare.

3. Să se insereze într-o anumită poziție a unui șir de caractere, un alt șir. Datele vor fi preluate de la tastatură sau din fișier. Să se șteargă o porțiune a unui șir de caractere care începe dintr-o anumită poziție și are un anumit număr de caractere. Se recomandă utilizarea clasei StringBuilder.

4. Să se realizeze un program care citește numele si CNP-ul pe care îl au n persoane. Valoarea lui n se citește de la tastatură. Programul va afișa informațiile introduse și în plus pentru fiecare persoana va afișa vârsta. Cât timp un CNP-ul este introdus greșit programul va cere reintroducerea acestuia. Pentru simplitate se consideră că CNP-ul este valid dacă îndeplinește următoarele condiții:

- are 13 caractere;

- toate caracterele sunt cifre;

- prima cifră are una din valorile 1, 2, 5, 6 ;

- cifra de control a CNP-ului are o valoare validă.

Se va crea clasa Persoana cu variabile membre private nume (String) şi cnp (String). Clasa va avea constructor cu parametri, gettere si settere în funcție de necesități şi metoda getVarsta() care va calcula şi va returna vârsta persoanei extrăgând data nașterii din CNP şi citind din sistem data curentă. Se va utiliza clasa LocalDate. Se va crea un vector în care se vor adăuga obiectele de tip Persoana. Fiecare element din vectorul va fi afișat pe un rând în formatul nume, CNP, varsta.

EN: Java Programming - Lab 2, tasks to be solved:

1. The file judete_in.txt contains an unordered list of counties in the country. Load the data from the file into a String array and sort this array using the sort() method from the Arrays class. Return the position of a county entered from the keyboard in the sorted array. Use the binary search method from the Arrays class.

2. The file cantec_in.txt contains the lyrics of a chosen song. Write a program that creates the file cantec_out.txt, which contains the lyrics of the original song but additionally, next to each line, displays the number of words on the line and the number of vowels on each line. An asterisk (*) will be placed next to the lines ending with a chosen group of letters. Lines for which a randomly generated number is less than 0.1 will be written in uppercase (random numbers between 0 and 1 will be generated). Define a class Verse, which has a private member variable, a string representing the verse, and develop a method for each requirement above (a method that returns the number of words, a method that returns the number of vowels, etc.). Create an array of Verse objects that will contain the information retrieved from the input file.

3. Insert another string at a certain position in a character array. The data will be taken from the keyboard or from a file. Delete a portion of a character array starting from a certain position and having a certain number of characters. It is recommended to use the StringBuilder class.

4. Create a program that reads the names and the Personal Identification Number (CNP) of n people. The value of n is read from the keyboard. The program will display the entered information, and additionally, for each person, it will display their age. As long as a CNP is entered incorrectly, the program will ask for re-entry. For simplicity, consider a CNP valid if it meets the following conditions:

- it has 13 characters;

- all characters are digits;

- the first digit has one of the values 1, 2, 5, 6;

- the control digit of the CNP has a valid value.

Create the class Person with private member variables name (String) and cnp (String). The class will have a parameterized constructor, getters, and setters as needed, and the method getAge() which will calculate and return the age of the person by extracting the birth date from the CNP and reading the current date from the system. Use the LocalDate class. Create an array to which Person objects will be added. Each element of the array will be displayed on a line in the format name, CNP, age.
