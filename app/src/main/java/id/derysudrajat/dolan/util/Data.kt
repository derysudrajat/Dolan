package id.derysudrajat.dolan.util

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import id.derysudrajat.dolan.model.Destination
import id.derysudrajat.dolan.model.Region

object Data {

    object User{
        val github = "https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png"
        val ig = "https://i.pinimg.com/originals/8a/77/05/8a770507298d728a1e3e039a0507dd8e.png"
        val medium = "https://lh3.googleusercontent.com/qF9y0xIiYo_dk0JpryEl-lT2wJMDmz7groOBXqkalFg1SWPLklhuAUp0jIjoSLxDEi4"
        val bg = "https://images.unsplash.com/photo-1483058712412-4245e9b90334?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80"
    }

    val myAva =
        "https://avatars3.githubusercontent.com/u/32610660?s=460&u=f2945b508ae75d9d543473286dcf788318e731e9&v=4"
    val data = mutableListOf(
        Destination(
            "Raja Ampat",
            """
            Raja Ampat menjadi primadona baru di dunia pariwisata Indonesia. Pesona tempat wisata di Indonesia ini mulai banyak dikenal baik oleh wisatawan domestik maupun mancanegara. Raja Ampat sendiri merupakan kumpulan dari pulau-pulau di ujung Papua. Ada empat pulau utama di sini, yaitu Waigeo, Misool, Salawati dan Batanta
            
            Kekayaan alam bawah laut Raja Ampat tak perlu diragukan lagi. Perairan di tempat wisata ini dikenal sebagai salah satu lokasi menyelam dan snorkeling terbaik di dunia. Bahkan The Nature Conservancy menyebut bahwa sekitar 75% biota laut dunia dapat ditemukan di perairan Raja Ampat. Untuk membuktikannya, silakan siapkan perlengakapan menyelam Anda dan mulailah menjelajahi alam bawah lautnya. Bulan Oktober dan November disebut sebagai waktu yang terbaik untuk menyelam di sini karena cuaca dan kondisi perairan sangat ideal.
            
            Selain menyelam, Anda juga bisa menjelajah keindahan daratan pulau-pulau di Raja Ampat ini. Warga setempat akan dengan senang hati menawarkan jasa sebagai pemandu. Selama trekking, Anda juga bisa mampir ke rumah-rumah warga dan berinteraksi secara langsung atau membeli kerajinan tangan seperti patung suku Asmat dan alat musik tradisional hasil karya mereka sebagai suvenir. Bertambah lagi tempat wisata di Indonesia buat Anda kunjungi.
        """.trimIndent(),
            "Papua, Indonesia",
            2,
            4.8f,
            "https://c4.wallpaperflare.com/wallpaper/773/73/85/photography-landscape-nature-aerial-view-wallpaper-preview.jpg",
            mutableListOf(
                "https://cache.desktopnexus.com/thumbseg/688/688927-bigthumbnail.jpg",
                "https://img4.goodfon.com/wallpaper/nbig/d/ff/raja-ampat-radzha-ampat-indoneziia-poberezhe-lodka.jpg",
                "https://3.bp.blogspot.com/-dcLw8WHFJ9A/UmiyngywjmI/AAAAAAAABYI/8bH0sCesWIQ/s1600/Kumpulan+Foto+Kepulauan+Raja+Ampat+6.jpg",
                "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/03/010103031717/1-3-Misool-By-marisckaprue.jpg",
                "https://img.theculturetrip.com/450x300/smart/wp-content/uploads/2017/10/shutterstock_536657701.jpg",
                "https://www.synotrip.com/sites/default/files/styles/900x900/public/indonesia45/raja_5.jpg?itok=zF8tt-wU"
            )
        ),
        Destination(
            "Pulau Komodo",
            """
            Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain di sekitar Kepulauan Nusa Tenggara. Pada tahun 1986, UNESCO menetapkan tempat wisata di Indonesia ini sebagai salah satu situs warisan dunia. Pulau ini dianggap sebagai habitat binatang komodo yang wajib dilindungi. Salah satu penghargaan tertinggi yang berhasil diraih adalah berhasil masuk dalam jajaran tujuh kejaiban alam di dunia atau yang lebih dikenal dengan New Seven Wonders of Nature pada tahun 2011.
            
            Tempat wisata ini menawarkan keindahan daratan dan alam bawah laut yang luar biasa. Ada banyak hal yang bisa Anda lakukan di sini, mulai dari trekking, menyelam sampai snorkerling. 

            Untuk trekking, Anda bisa menjelajah pulau bersama rombongan dan seorang ranger atau pemandu. Dalam perjalanan, Anda bisa menemukan komodo yang sedang berburu mangsa atau beristirahat. Ranger akan membekali Anda dengan sebuah tongkat yang ujungnya bercabang. Tongkat ini dipercaya dapat melemahkan komodo saat binatang ini mulai menyerang. Dengan menekan leher komodo menggunakan ujung tongkat yang bercabang, binatang ini seketika akan jinak. Penting bagi Anda untuk menjaga setiap gerakan saat berjalan karena binatang ini sangat peka terhadap gerakan yang tiba-tiba.
        """.trimIndent(),
            "Nusa Tenggara, Indonesia",
            2,
            4.2f,
            "https://i.pinimg.com/736x/0f/35/d3/0f35d3f0d3b4f5f74971aefff5cc185e.jpg",
            mutableListOf(
                "https://aktourtravel.com/wp-content/uploads/2019/03/Pulau-Padar.jpg",
                "https://www.jabatowisata.com/index/jabato/files/komodo-island-mytravelingtheword.jpg",
                "https://lh3.googleusercontent.com/proxy/inKVCYUU5aTgNpC563to0ZlK3GPopSHSQm9i_kmZeu2BfKRCevsfRdLNmqAK_npaz5pm6fP-eig8JIfC_m3eaKA73ojHZj3uvBmkXd90131bzx4sfDQzHHtTxQ",
                "https://komodoisland.co.id/wp-content/uploads/2018/11/Komodo-Island-from-KL-850x478.jpg",
                "https://indonesia-tourism.com/tour/wp-content/uploads/2016/01/Explore_Rinca.jpg",
                "https://i.pinimg.com/originals/34/5d/d7/345dd7fa70fae799bb0a113301022eeb.png"
            )
        ),
        Destination(
            "Trio Gili",
            """
            Trio Gili merupakan tiga pulau cantik yang ada di Lombok. Ketiga pulau tersebut antara lain Gili Trawangan, Gili Meno dan Gili Air. Ketiganya tak hanya dikenal oleh wisatawan domestik, tapi juga telah berhasil mengundang banyak wisatawan mancanegara untuk datang. 

            Dari ketiga pulau tersebut, bisa dibilang Gili Trawangan adalah yang paling populer. Selain karena ukurannya yang lebih luas dibanding kedua pulau lainnya, di sini juga telah berdiri banyak tempat hiburan seperti bar dan kafe. Ada banyak kegiatan yang bisa Anda lakukan di tempat wisata ini mulai dari berjemur, menyelam sampai snorkeling. Yang lebih asyik, Anda juga bisa menyewa sepeda atau naik cidomo, kereta kuda semacam delman, untuk berkeliling pulau. 

            Meskipun Gili Trawangan lebih banyak dikunjungi, namun Gili Meno dan Gili Air tak kalah menarik. Kedua pulau ini juga memiliki keindahan pantai dan alam bawah laut yang menunggu untuk Anda jelajahi. Suasana keduanya relatif lebih sepi dan tenang sehingga cocok untuk Anda yang memang ingin lepas dari keramaian.
        """.trimIndent(),
            "Lombok, Indonesia",
            2,
            4.3f,
            "https://www.luxuryaround.com/wp-content/uploads/2018/03/Gili-Air-Sunrise.jpg",
            mutableListOf(
                "https://3.bp.blogspot.com/-5XEjQ5NPyl4/XJSHHtyW5pI/AAAAAAAAAVg/svrabbunP8kNl2f26Z3fNbbSSaglBYlnACLcBGAs/s1600/Infomasi%2BSeputar%2BWisata%2BLombok%2BPantai%2BGili%2BMeno.jpg",
                "https://cdn.lifestyleasia.com/wp-content/uploads/2018/12/30195720/Gili-Islands.jpg",
                "https://brightcove04pmdo-a.akamaihd.net/5104226627001/5104226627001_5513051237001_5513043006001-vs.jpg?pubId=5104226627001&videoId=5513043006001",
                "https://www.silverkris.com/wp-content/uploads/2019/09/Lombok-gili_Gili-Asahan-offers-unpolluted-views-of-the-Milky-Way.jpg",
                "https://www.thepoortraveler.net/wp-content/uploads/2016/08/Gili-Trawangan-Island-Bike-Adventure-1200x798.jpg",
                "https://4.bp.blogspot.com/-MxZw4yHwx8E/UrXY1cJsXeI/AAAAAAAAA0g/m-T4TaY2NXA/s1600/PB241799.jpg"
            )
        ),
        Destination(
            "Candi Borobudur",
            """
            Candi Borobudur merupakan kompleks candi Buddha terbesar di dunia. Tempat wisata di Indonesia ini ditetapkan UNESCO sebagai salah satu situs warisan dunia pada tahun 1991. Candi Borobudur sempat terkubur abu vulkanik dari letusan Gunung Merapi, sampai kemudian ditemukan oleh Sir Thomas Stamford Raffles di tahun 1814. 

            Tempat wisata di Indonesia ini diperkirakan dibangun pada tahun 824. Bangunannya tersusun dari balok vulkanik dan membentuk 504 arca Buddha, 72 stupa dan sebuah stupa induk tepat di puncak candi. Mitosnya, jika Anda memasukkan tangan ke lubang stupa dan berhasil menyentuh arca yang ada di dalamnya, maka keinginan Anda akan terkabul. Di sini, Anda juga bisa membeli bermacam suvenir mulai dari kaos, gantungan kunci, kipas sampai miniatur Candi Borobudur. 

            Pada perayaan Waisak, Candi Borobudur menjadi pusat berkumpulnya banyak umat Buddha dari berbagai belahan dunia seperti Tibet dan Thailand. Ritual ini menjadi salah satu daya tarik wisata di sini. Yang paling diminati wisatawan adalah acara puncak berupa pelepasan lampion ke langit. Lampion-lampion tersebut akan dilepaskan bersama dengan doa dan harapan untuk satu tahun ke depan.
        """.trimIndent(),
            "Magelang, Indonesia",
            1,
            4.0f,
            "https://www.worldofghibli.id/wp-content/uploads/2020/03/gambar-wisata-candi-borobudur-magelang-jawa-tengah.jpg",
            mutableListOf(
                "https://www.twisata.com/wp-content/uploads/2015/07/Gambar-Candi-Borobudur.jpg",
                "https://www.worldofghibli.id/wp-content/uploads/2020/03/pemandangan-indah-di-candi-borobudur.jpg",
                "https://www.worldofghibli.id/wp-content/uploads/2020/03/gambar-sejarah-candi-borobudur.jpg",
                "https://p4.wallpaperbetter.com/wallpaper/456/754/516/the-buddhist-temple-of-borobudur-indonesia-wallpaper-preview.jpg",
                "https://www.jacadatravel.com/wp-content/uploads/2014/11/dreamstimemaximum_34285743_07.jpg",
                "https://i.pinimg.com/originals/9a/7a/43/9a7a430c2e353c7402bf8b2fb0610467.jpg"
            )
        ),
        Destination(
            "Dieng Plateau",
            """
            Bergeser ke Jawa Tengah, ada tempat wisata menarik di Dataran Tinggi Dieng yang selalu jadi tujuan favorit wisatawan sepanjang tahun. Berada di ketinggian 2.000 mdpl, objek wisata yang juga dikenal sebagai Dieng Plateau ini merupakan sebuah kaldera yang dikelilingi gunung aktif. 

            Hawa di Dataran Tinggi Dieng sangat dingin. Pada waktu-waktu tertentu, suhunya bisa mencapai minus. Kalau beruntung, kamu bahkan bisa melihat salju. Ada banyak spot menarik yang bisa kamu temui di sini, seperti Telaga Warna, Kawah Candradimuka, Kompleks Candi Arjuna, Bukit Sikunir, dan lainnya.
        """.trimIndent(),
            "Jawa Tengah, Indonesia",
            1,
            4.4f,
            "https://www.superadventure.co.id/uploads/news/2017/02/27/5cd38bd81081_crop_720_480_rel_left_top.jpg",
            mutableListOf(
                "https://wisatalengkap.com/wp-content/uploads/2017/07/Gunung-Prau.jpg",
                "https://smol.id/wp-content/uploads/2020/06/candi-arjuna-dieng.jpg",
                "https://exploredieng.files.wordpress.com/2014/02/explore-dieng1.jpg",
                "https://c0.wallpaperflare.com/preview/610/949/227/indonesia-dieng-plateau-dieng-culture-festival-dieng-thumbnail.jpg",
                "https://fotowisata.com/wp-content/uploads/2013/12/tempat-wisata-di-dieng-plateau.jpg",
                "https://www.traveloista.co.id/images/paket/01/3PM00039.jpg"
            )
        ),
        Destination(
            "Gunung Bromo",
            """
            Gunung Bromo selama ini memang menyimpan pemandangan alam yang sangat indah. Kamu akan temukan pesona bukit teletubbies yang menawan, hamparan lautan pasir yang sempurna, dan beberapa kawah yang ciamik. 

            Di kawasan sekitar Gunung Bromo, kamu pun bisa berinteraksi dengan suku asli yang ada disana. Suku tersebut adalah Suku Tengger yang masih memiliki hubungan kerabat dengan kerajaan majapahit.
        """.trimIndent(),
            "Jawa Timur, Indonesia",
            1,
            4.1f,
            "https://c4.wallpaperflare.com/wallpaper/841/803/723/5bd3882fae229-wallpaper-preview.jpg",
            mutableListOf(
                "https://www.asliindonesia.net/wp-content/uploads/2016/02/Mount2BBromo2BSunset2BTour2Bfrom2BSurabaya252C2BMalang252C2BBanyuwangi.jpg",
                "https://www.wallpapers13.com/wp-content/uploads/2015/12/Mount-Bromo-Wallpapers-Hd.jpg",
                "https://www.superadventure.co.id/uploads/news/2019/01/10/ed7433c1de68.jpg",
                "https://www.bingwallpaperhd.com/wp-content/uploads/2018/08/BromoJava-1600x900.jpg",
                "https://lh3.googleusercontent.com/proxy/mlSbXlTYJN_t3mJNUQmbuqBnDMy1FXew940XCK4wQrF_0LG_jrxBQH83W5G58OUgcjyw532VZmB9PcA-IrquEwxDlDIKnjy3gL2ah9CVuQ=s0-d",
                "https://c4.wallpaperflare.com/wallpaper/33/405/215/volcano-stars-landscape-mount-bromo-wallpaper-preview.jpg"
            )
        ),
        Destination(
            "Taman Nasional Baluran",
            """
                Jika kamu sedang mencari tempat liburan di Indonesia yang berupa wisata alam terbaik di Indonesia dengan pesona ala Afrika yang kental, maka kamu bisa datang ke Taman Nasional Baluran. Di Taman Nasional Baluran ini kamu akan temukan padang savanna yang luas dengan aneka ragam satwa yang sulit kamu temukan di wilayah lain. 

                Berbagai spot wisata akan kamu temukan. Kamu pun bisa berfoto dengan satwa liar yang ada di Taman Nasional Baluran. Namun tetap kamu harus berhati – hati ketika berinteraksi dengan hewan liar yang ada di Taman Nasional Baluran. 

                Jika kamu suka dengan pemandangan laut, terdapat laut indah dengan terumbu karang alami yang cocok menjadi tempat terbaik diving di wilayah ini. Jangan lupa bawa kamera dan abadikan semua moment seru kamu selama berwisata di Taman Nasional Baluran.
        """.trimIndent(),
            "Jawa Timur, Indonesia",
            1,
            4.5f,
            "https://dmid0fhonc2z0.cloudfront.net/wp-content/uploads/2015/08/Taman-Nasional-Baluran_Alam-Bebas-di-Timur-Pulau-Jawa-2.jpg",
            mutableListOf(
                "https://fotowisata.com/wp-content/uploads/2013/12/taman-nasional-baluran-3.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS1n1dGjS_Fdh1IuONqzddA8irOLgdHzoc5cw&usqp=CAU",
                "https://i.pinimg.com/originals/c4/a1/37/c4a137ca9550792ec9fddf815636ca0c.jpg",
                "https://i.pinimg.com/originals/37/2c/e0/372ce0d9367df6325c589d281afc8e51.jpg",
                "https://merahputih.com/media/2015/11/29/JzEQKDLxRo1448761124.jpg",
                "https://cdn2.tstatic.net/travel/foto/bank/images/taman-nasional-baluran_20160814_233906.jpg"
            )
        ),
        Destination(
            "Kepulauan Belitung",
            """
            Nama Belitung makin populer sejak munculnya novel “Laskar Pelangi” karya Andrea Hirata. Pulau yang terkenal sebagai penghasil timah ini menawarkan surga wisata yang dijamin akan membuatmu terpukau. 

            Ciri khas pantai di Kepulauan Belitung adalah batu granit raksasa yang tersebar di segala penjuru. Air laut yang biru jernih, pasir putih, dan pepohonan kelapa di bibir pantai adalah kombinasi sempurna untuk ciptakan momen liburan tak terlupakan.
        """.trimIndent(),
            "Bangka Belitung, Indonesia",
            0,
            4.6f,
            "https://www.befreetour.com/img/produk/3d2n-hopping-tour-belitung-island/3d2n-hopping-tour-belitung-island_887a4672fe34bafe5ffae641717187baae05349f.jpg",
            mutableListOf(
                "https://i.pinimg.com/originals/d5/84/dc/d584dce7db4920e7bef0e9619b48f496.jpg",
                "https://www.visitbelitungtour.com/asap/assets/asap/pages/setting/paket/images/13/190303170902_180224170434_FullSizeRender_5_5.jpg",
                "https://www.datawisata.com/wp-content/uploads/2017/08/pulau-lengkuas-bangka-belitung-1024x768.jpg",
                "https://ksmtour.com/media/images/articles4/pantai-parai-tenggiri-bangka-belitung.jpg",
                "https://i.pinimg.com/originals/4c/ba/a8/4cbaa8cd625f90b97de118c072d1ec8d.jpg",
                "https://www.amanahbelitungtour.com/wp-content/uploads/2019/11/Pulau-Lengkuas.jpg"
            )
        ),
        Destination(
            "Tana Toraja",
            """
            Tana Toraja memiliki keindahan alam yang luar biasa mulai dari deretan pegunungan dan hijau perbukitannya. Selain kaya akan alamnya, tempat wisata d Indonesia ini juga kaya akan budaya leluhur yang masih dijaga sampai saat ini. Di sini, ada banyak tradisi kuno yang masih dipertahankan, salah satunya adalah Rambu Solo’. Rambu Solo’ merupakan upacara pemakaman di Tana Toraja. Apa menariknya upacara pemakaman? Eits, upacara pemakaman adat Tana Toraja ini tak bisa Anda lewatkan begitu saja. 

            Rambu Solo’ merupakan satu-satunya upacara pemakaman termahal di Indonesia dan mungkin juga di dunia. Upacara ini dilakukan selama berhari-hari dengan biaya yang tak sedikit. Salah satu ritual yang dilakukan adalah sembelih kerbau. Kerbau ini tak cukup hanya satu. Semakin tinggi kasta orang yang meninggal, maka semakin banyak kerbau yang dikorbankan. 

            Orang-orang Tana Toraja percaya bahwa selama belum dimakamkan, orang yang meninggal adalah orang yang sedang sakit. Tubuhnya sengaja disuntik formalin agar tak membusuk selama menunggu keluarga bisa menyelenggarakan Rambu Solo’. Orang yang meninggal dianggap hanya sedang dalam kondisi sakit saja. Keluarga tetap memperlakukannya seperti orang yang masih hidup, mengajaknya mengobrol dan bercanda. Jika telah dilakukan Rambu Solo’, barulah keluarga percaya orang tersebut sudah meninggal. 

            Jika Rambu Solo’ kurang menantang bagi Anda, cobalah mengunjungi Londa atau makam gantung ala Tana Toraja. Di sini, Anda bisa menemukan banyak peti mati yang digantungkan dalam gua di tebing curam. Berani berkunjung?
        """.trimIndent(),
            "Sulawesi Selatan",
            2,
            4.0f,
            "https://thumbs.dreamstime.com/b/indonesia-sulawesi-tana-toraja-traditional-village-sweeping-elaborately-painted-houses-boat-shaped-roofs-tongkonan-76886339.jpg",
            mutableListOf(
                "https://wanderingtricia.files.wordpress.com/2013/08/wpid-photo-aug-10-2013-240-pm.jpg",
                "https://akhdanrentalmakassar.com/wp-content/uploads/2016/09/Tongkonan-Toraja.jpg",
                "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/040404042727/6-1-Lemo-By-kiven_eleven11.jpg",
                "https://userscontent2.emaze.com/images/5381890c-fd6d-41a2-a08e-7524bdb807bd/8106343eba13d3434819645f74cf8812.jpg",
                "https://livetopstyle.files.wordpress.com/2014/10/tana-toraja-funeral-ceremonies.jpg",
                "https://d3hne3c382ip58.cloudfront.net/resized/750x420/sulawesi-expedition-tana-toraja-trek-tour-2-493073_1568177320.JPG"
            )
        ),
        Destination(
            "Kepulauan Anambas",
            """
            Kepulauan Anambas di Riau adalah destinasi wisata pertama yang wajib dimasukkan ke dalam bucket list-mu. Tempat ini menyajikan pemandangan alam yang super cantik dan memesona. 

            Di sini, Anda akan dimanjakan dengan panorama pantai berpasir putih berpadu dengan air laut berwarna hijau toska. Bebatuan karang raksasa yang tersebar di seluruh pulau juga menambah daya tarik tempat ini sebagai tempat wisata di indonesia. Begitu eksotisnya, Kepulauan Anambas dinobatkan sebagai Kepulauan Tropis Terbaik di Asia pada tahun 2013.
        """.trimIndent(),
            "Riau, Indonesia",
            0,
            4.3f,
            "https://i.pinimg.com/736x/7e/a6/45/7ea645459b4fde29d065ce55ef3976d7.jpg",
            mutableListOf(
                "https://lh3.googleusercontent.com/jN_Un0NqWxhk_oaNuSKI7B6n4ziKzHlLHvji3OOu5w1dm8v8hvI2Sz3N0sEhrNjFYGB5tbPSGpwGmDOU-RHI0b-HWg2TGM_YXiUbuOv0pFjyj8DKP69VDp2ZkH0wwaEyZ79gRADE",
                "https://i.pinimg.com/736x/69/46/10/6946100adc6cc69febebb832ff8e7720.jpg",
                "https://ak.picdn.net/offset/photos/56e1f8bb2d1642c18962e70e/medium/photo.jpg",
                "https://i.pinimg.com/236x/37/96/4a/37964a92741d6e8cbd2435507e8c0f06--the-number--small-island.jpg",
                "https://i.pinimg.com/originals/eb/46/c6/eb46c68243951bd35812848c64dd2638.jpg",
                "https://traveltodayindonesia.com/wp-content/uploads/2017/09/Anambas-3.jpg"
            )
        ),
        Destination(
            "Danau Toba",
            """
            Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Supervulkan. Danau ini memiliki panjang 100 kilometer (62 mil), lebar 30 kilometer (19 mi), dan kedalaman 505 meter (1657 ft). Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 meter (2953 ft). Danau ini membentang dari 2.88°N 98.52°E sampai 2.35°N 99.1°E. Ini adalah danau terbesar di Indonesia dan danau vulkanik terbesar di dunia.

            Danau Toba adalah lokasi letusan gunung berapi super masif berkekuatan VEI 8 sekitar 69.000 sampai 77.000 tahun yang lalu yang memicu perubahan iklim global. Metode penanggalan terkini menetapkan bahwa 74.000 tahun yang lalu lebih akurat. Letusan ini merupakan letusan eksplosif terbesar di Bumi dalam kurun 25 juta tahun terakhir. Menurut teori bencana Toba, letusan ini berdampak besar bagi populasi manusia di seluruh dunia; dampak letusan menewaskan sebagian besar manusia yang hidup waktu itu dan diyakini menyebabkan penyusutan populasi di Afrika timur tengah dan India sehingga memengaruhi genetika populasi manusia di seluruh dunia sampai sekarang.

            Ada juga tempat wisata yang terkenal yaitu wisata air rangat tepatnya di bawah kaki gunung pusuk buhit, air rangat itu adalah air hangat yang berasal dari gunung yang meletus dan Pusuk Buhit sendiri adalah sebuah gunung aktif yang sangat disakralkan oleh etnis Batak sehingga beragam cerita mistis pun terdapat di gunung ini. Gunung ini terletak di Pulau Samosir, dan merupakan puncak tertinggi dari semua dataran tinggi di Pulau Samosir. Dengan ketinggian sekitar 1.077 meter dari Danau Toba, gunung ini terlihat berdiri dengan gagahnya. Sehingga apabila Anda sedang berada di sekitar perairan Danau Toba, maka Gunung Pusuk Buhit ini akan terlihat sangat jelas sekali dengan puncaknya yang berwarna hijau dengan kombinasi warna abu-abu dan ditutupi oleh awan di sekitarnya. Lalu ketika kita berenang di air rangat itu tidak membayar uang masuk, tinggal masuk saja tapi setelah kita selesai mandi atau selesai berenang kita diharuskan makan di tempat permandian air rangat.
        """.trimIndent(),
            "Sumatra Utara, Indonesia",
            0,
            4.4f,
            "https://www.primeindonesia.net/wp-content/uploads/2018/03/sumatra-toba-02.jpg",
            mutableListOf(
                "https://cdn.lifestyleasia.com/wp-content/uploads/2019/04/24161131/lake-toba-sumatra.jpg",
                "https://images.unsplash.com/photo-1569081562679-6d71c00aab86?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",
                "https://4.bp.blogspot.com/-1rJIrxv0DfI/VpM3bSQGfTI/AAAAAAAAbMA/ugjaFe0c_L0/s640/danau%2Btoba.jpg",
                "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/03/101003031010/1-1-Pusuk-Buhit-By-sukronstrs_.jpg",
                "https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2018/03/danau-toba-wisata-feature.jpg",
                "https://www.konfrontasi.com/sites/default/files/styles/article_big/public/article/2016/05/Danau-Toba-Konfrontasi.jpg?itok=VNUi8XPq"
            )
        ),
        Destination(
            "Palembang",
            """
            Jadi salah satu kota tertua di Indonesia, Palembang merupakan wilayah peninggalan Kerajaan Sriwijaya yang menyimpan sejuta warisan budaya. Gak cuma terkenal dengan makanan khasnya, Palembang juga memiliki potensi yang sangat menarik.

            Terbukti pada 2018, Palembang berhasil terpilih menjadi tuan rumah Asian Games 2018 bersama Jakarta. 
            
            Ada beberapa tempat menarik yang bisa dijadikan spot foto foto nih contohny jembatan ampera yang udah menjadi ikon kota ini, selain itu ada juga pulau kemaro dan masih banyak lagi
            
            Demi menyambut Asian Games 2018, Jembatan Ampera direnovasi jadi makin cantik. Ada bangku-bangku di pinggirnya dan jam analog raksasa yang ditempatkan di menara jembatan. Wajib foto-foto, deh! 
        """.trimIndent(),
            "Sumatra Utara, Indonesia",
            0,
            4.2f,
            "https://4.bp.blogspot.com/-dfLa68-u2z0/VIQoCZRaXmI/AAAAAAAAAAg/f8syf4Waync/s1600/Ampera-Bridge-Palembang-Indonesia.jpg",
            mutableListOf(
                "https://www.tarungnews.com/media/news/palembang_jembatan_Ampera.jpg",
                "https://c4.wallpaperflare.com/wallpaper/100/474/352/ampera-bridge-indonesia-palembang-sumatra-wallpaper-preview.jpg",
                "https://i.pinimg.com/originals/27/24/68/272468caa5f45e7643cf35604136ab32.jpg",
                "https://4.bp.blogspot.com/-1THL6LkR-Hc/WecuSJpjr1I/AAAAAAABKBI/l9ayuVRTh5YbTDe3GG3BbXlMZU3XtTgqQCEwYBhgL/s1600/IMG_9287%2B%2528Copy%2529.jpg",
                "https://media-cdn.tripadvisor.com/media/photo-s/0c/96/56/6b/photo7jpg.jpg",
                "https://www.jakpost.travel/wimages/large/73-738971_jakabaring-sport-complex-asian-games-2018-preparation.jpg"
            )
        )
    )

    val titleRegion = mutableListOf(
        "Keindahan Bumi Sumatra dan Riau Indonesia",
        "Menjelajahi Megahnya Pulau Jawa Indonesia",
        "Eksplor Si Indah dari Timur Indonesia"
    )

    val placeRegion = mutableListOf(
        "Sumatra, Indonesia",
        "Jawa, Indonesia",
        "Papua, Indonesia"
    )

    val bannerRegion = mutableListOf(
        "https://lemabang.files.wordpress.com/2011/08/ampera3.jpg",
        "https://www.asliindonesia.net/wp-content/uploads/2016/02/Mount2BBromo2BSunset2BTour2Bfrom2BSurabaya252C2BMalang252C2BBanyuwangi.jpg",
        "https://images3.alphacoders.com/676/thumb-1920-676171.jpg"
    )

    private fun getDestinationByRegion(region: Int, callback: (region: Destination) -> Unit) {
        data.forEach {
            if (it.region == region) {
                callback(it)
            }
        }
    }

    fun getSummaryRegion(region: Int): Region {
        val dataNew = mutableListOf<Destination>()
        var ratingAve = 0.0f

        getDestinationByRegion(region) {
            dataNew.add(it)
            ratingAve += it.rating!!
        }

        val dataRegion = Region(
            bannerRegion[region],
            titleRegion[region],
            region,
            (ratingAve / dataNew.size),
            placeRegion[region],
            dataNew
        )

        return dataRegion
    }

    fun Float.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()

    @ColorInt
    fun Context.getColorFromAttr(
        @AttrRes attrColor: Int,
        typedValue: TypedValue = TypedValue(),
        resolveRefs: Boolean = true
    ): Int {
        theme.resolveAttribute(attrColor, typedValue, resolveRefs)
        return typedValue.data
    }
}