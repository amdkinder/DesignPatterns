BUILDER PATTERN.

    Builder pattern - bu obyektlarni bosqichma-bosqich
yaratishga imkon beruvchi generativ pattern. Builder - obyektlarni turli xil ko'rinishda
bir xil builder kodidan foydalangan holatda qurish imkoniyatini beradi.

Muammo
    Constructor ichiga koplab parametrlarni oluvchi va murakkab obyektlar uchun ishlatiladi.
    Bu esa dastur ichida kop kelishi undan ham muammoli vaziyat.

Struktura
    1. Builder interface har qanday quruluvchi uchun umumiy bolgan obyektni bosqichlari yoziladi.
    2. Builder esa qurulish bosqichlarini ozlariga mos ravishda yozib chiqiladi.
    3. Product - quruluvchi obyekt. Productlar xar xil quruvchilar tomonidan yaratiladigan obyektlar.
    4. Director - qurilish bosqichlarini aniqlash uchun konfiguratsiya.
    5. Odatda client tayyor obyekt konstruksiyasini director constructoriga yuboradi. Bazi xolatlarda
    bitta obyekt uchun xar xil builder ishlatsa ham boladi.


