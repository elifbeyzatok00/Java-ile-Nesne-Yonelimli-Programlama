# Nesne Yönelimli Programlama Felsefesi ( Object-Oriented Programming Philosophy )

## Nesne yönelimli programlama nedir?

Nesne yönelimli programlama (Object -Oriented Programming), nesneler ve o nesnelerin birbirleriyle olan ilişkilerini baz alan bir programlama paradigmasıdır (modelidir), bir yazılım geliştirme yaklaşımıdır ve bu yaklaşımın programlamaya entegre edilmesidir.

## Nesne yönelimli modelleme nasıl yapılır?

Nesne yönelimli modelleme, nesnelerin özellik (attribute) ve eylemlerine (activity) göre sınıflandırılması anlayışı esas alınarak gerçekleştirilir. Bu anlayış çerçevesinde, karşımıza nesne yönelimli programlamanın 2 temel kavramı çıkar. Bunlar, sınıf (class) ve nesnedir (object).

## Sınıf (Class) nedir?

Sınıf ,aynı özellik ve eylemleri taşıyan varlıkların (nesnelerin) ortak kümesini belirten tanımdır. Başka bir ifadeyle, nesnelerin özellik (attribute) ve eylemlerinin (activity) belirtildiği ,deklare edildiği, tanımlandığı yerdir.

## Nesne (Object) nedir?

Nesne, ait olduğu sınıftaki özelliklerinin değerleri belli olan ve eylemleri sergileyiş şekli belli olan, biricik (unique) canlı bir varlıktır. Bu noktada canlı ile kast edilen, nesnenin RAM (Random Access Memory) ’de yaşadığı, ona RAM’de yer ayrıldığıdır (memory allocation).

## Nesnelerin özellik (attribute) ve eylemleri (activity) ne anlama gelir?

Özelliği, (attribute,field) şayet bir insan nesnesi üzerinden anlatacak olursak; ad, soyad, yaş, boy, kilo, e-mail adresi gibi onu ifade eden hususlardır. Yapısal programlama dillerinde karşılığı değişkenlerdir (variables).

Eylem, (activity) yine bir insan nesnesini ele aldığımızda koşmak, yemek, uyumak, yürümek gibi sonuna -mek/-mak eki getirebildiğimiz fiillerdir. Yapısal programlama dillerinde karşılığı metotlar (methods) veya aynı anlamı taşıyan fonksiyonlardır (functions).

Şimdi, hem anlattıklarımı pekiştirmek adına hem de akılda kalıcılığı sağlaması açısından gerçek hayattan başka bir senaryoyu ele alalım ve sınıf, nesne, nesnelerin özellik ve eylemleri gibi soruları cevaplayalım.

**Senaryo:**

Otomobil ; markası, rengi ve modeli olan, gaza basınca hızlanan, frene basınca yavaşlayan, direksiyonun döndüğü tarafa hareket eden ve birden fazla nesneyi (object) barındıran bir sınıflamayı tanımlar. Dolayısıyla, bu senaryoda otomobil bir sınıftır. Şayet, xx-xx-xxxx plakalı siyah bir Audi A4 otomobilinden bahsediyorsak , bu otomobil sınıfına ait bir nesnedir. Bunun nedeni, xx-xx-xxxx plakalı Audi A4 nesnesinin marka, renk ve model gibi özelliklerinin değerlerinin belli olması ve 100 km hıza kaç saniyede ulaştığının bilinmesidir.

Bu senaryoda plaka ,otomobil nesnelerini benzersiz (unique) olarak tanımlayan özelliktir (attribute). Otomobil nesnelerinin diğer özellikleri; gaz pedalı, fren pedalı, motor, lastik, far, direksiyon, dikiz aynası şeklinde çoğaltılabildiği gibi eylemleri ise; hızlanma, yavaşlama, hareket etme şeklinde çoğaltılabilir.

**Senaryo 2 :**

İnsan , kimlik numarası, adı, soyadı ve doğum tarihi (yaşı) olan, yemek yediğinde kilo alabilen, yürüdüğünde veya koştuğunda kilo verebilen ve birden fazla nesneyi barındıran bir sınıflamayı tanımlar. Dolayısıyla bu senaryoda İnsan bir sınıftır.

Şayet, kimlik numarası xxx-xxx-xxx-xx, adı “y” , soyadı “z” ve yaşı t olan bir kişiden bahsediyorsak, bu insan sınıfına ait bir nesnedir. Bunun sebebi, kimlik numarası xxx-xxx-xxx-xx olan bu kişinin, ad, soyad ve yaş özelliklerinin değerlerinin belli olması ve yemek yeme, yürüme ve koşma eylemlerini sergileyiş biçiminin de kendine has olmasıdır.

Bu senaryoda, kimlik numarası insan nesnelerini benzersiz olarak tanımlayan özelliktir. İnsan nesnelerinin diğer özellikleri, ad, soyad, yaş, boy, kilo şeklinde çoğaltılabileceği gibi ,eylemleri de yemek yeme, yürüme ve koşma şeklinde çoğaltılabilir.
