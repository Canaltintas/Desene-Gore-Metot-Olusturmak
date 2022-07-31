# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev - Desene Göre Metot Oluşturma
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
Örnek : 15 10 5 0 5 10 15

# Programın Çalışması : 
* 3 Parametreli bir Recursive Metot Oluştulur (int a,boolean false,int temp)
* * a = Kulanıcıdan alınan sayı
* * boolean = örüntü >= 0 değerinden sonra tersi işlem yapabilmek için kullanılan boolean değişkeni.
* * temp= döngünün bitişi için kullanıcıdan alınan değeri tutan geçici değişken.
* Kullanıcıdan değer alınır,
* Değere ekrana yazdırılır.
* a  <= 0 şartı kontrol edilir.
* * Koşul sağlanıyorsa f(a+5,true,temp) değeri çağrılır.
* boolean == true şartı kontrol edilir.
* * Koşul Sağlanıyorsa ve temp değeri ,a değerine eşit değilse f(a+5,true,temp) fonksiyonu çağırılır. temp değeri a değişkenine eşitse temp değeri döndürülür.
* f(a-5,false,temp) metotu çağrılır.
