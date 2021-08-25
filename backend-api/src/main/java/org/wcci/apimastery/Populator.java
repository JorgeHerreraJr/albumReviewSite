package org.wcci.apimastery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.resources.Album;
import org.wcci.apimastery.resources.Song;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.SongRepository;

@Component
public class Populator implements CommandLineRunner {

    private AlbumStorage albumStorage;
    private SongRepository songRepo;

    public Populator(AlbumStorage albumStorage, SongRepository songRepo) {
        this.albumStorage = albumStorage;
        this.songRepo = songRepo;

    }

    @Override
    public void run(String... args) throws Exception {

        Album albumOne = new Album("The Dark Side of the Moon", "Pink Floyd", "https://m.media-amazon.com/images/I/41g8eRJ-+RL._CR0,1,498,498_UX256.jpg", "Harvest Records", 5);
        albumOne.addComment("This is only the best record ever recorded. Pink Floyd, at this point, has mastered their soundscape musically and lyrically, following a series a brilliant experimental albums, they pour their heart and soul into this timeless masterpiece");
        albumOne.addComment("Dark Side is that rarest and most monolithic of beasts, you can tell it was released in or at least around 1973 and yet it is in some way timeless.");
        albumStorage.saveAlbum(albumOne);
        
        Song pfOne = new Song(albumOne, "Speak to Me", "https://open.spotify.com/track/574y1r7o2tRA009FW0LE7v?si=d758633434714f53", "1:05", 5);
        pfOne.addComment("This song speaks to my soul, could listen on repeat forever!");
        pfOne.addComment("Song comment about how awesome this song is, going to make this comment long on purpose " +
                        "text within the comment section so we can test our code to an extent that will let us test it like it should be tested in line with stuff");
        pfOne.addComment("Testing this song speaks to my soul, could listen on repeat forever!");
        pfOne.addComment("More testing his song speaks to my soul, could listen on repeat forever!");
        pfOne.addComment("Even more testing this song speaks to my soul, could listen on repeat forever!");
        pfOne.addComment("Double even more testing this song speaks to my soul, could listen on repeat forever!");
        songRepo.save(pfOne);

        Song pfTwo = new Song(albumOne, "Breathe (In the Air)", "https://open.spotify.com/track/2ctvdKmETyOzPb2GiJJT53?si=5ff8e186b4e34a5f", "2:49", 4);
        pfTwo.addComment("Not my most favorite song, but still a classic.");
        songRepo.save(pfTwo);
        
        Song pfThree = new Song(albumOne, "On the Run", "https://open.spotify.com/track/73OIUNKRi2y24Cu9cOLrzM?si=978318da3c5a4c79", "3:45", 4);
        pfThree.addComment("On the run is my favorite song OF ALL TIME. So good, so so good.");
        songRepo.save(pfThree);
        
        Song pfFour = new Song(albumOne, "Time", "https://open.spotify.com/track/3TO7bbrUKrOSPGRTB5MeCz?si=016ae6afdd98417e", "6:53", 4);
        pfFour.addComment("If there's one song I never get tired of, it's Time. It's on every playlist I create!");
        songRepo.save(pfFour);

        Song pfFive = new Song(albumOne, "The Great Gig in the Sky", "https://open.spotify.com/track/2TjdnqlpwOjhijHCwHCP2d?si=8162fed57cc04e02", "4:43", 2);
        pfFive.addComment("What can I say, great gig in the sky is just pure garbage. They should've never included this song on the album.");
        songRepo.save(pfFive);

        Song pfSix = new Song(albumOne, "Money", "https://open.spotify.com/track/0vFOzaXqZHahrZp6enQwQb?si=70d529a3f7bb4fc6", "6:22", 4);
        pfSix.addComment("Amazing song! Highly recommend everyone listens to this track at least once.");
        songRepo.save(pfSix);

        Song pfSeven = new Song(albumOne, "Us and Them", "https://open.spotify.com/track/1TKTiKp3zbNgrBH2IwSwIx?si=3e387098462f4c00", "7:49", 4);
        pfSeven.addComment("If I've said it once, I've said it again! Us and them never lets me down.");
        songRepo.save(pfSeven);

        Song pfEight = new Song(albumOne, "Any Colour You Like", "https://open.spotify.com/track/6FBPOJLxUZEair6x4kLDhf?si=3c62ea0b4715445e", "3:26", 4);
        pfEight.addComment("Any colour I like? More like ANY SONG I LIKE AM I RIGHT?!");
        songRepo.save(pfEight);

        Song pfNine = new Song(albumOne, "Brain Damage", "https://open.spotify.com/track/05uGBKRCuePsf43Hfm0JwX?si=3e4bb45708dd4e4a", "3:46", 4);
        pfNine.addComment("Not my favorite song, but it has it's moments.");
        songRepo.save(pfNine);

        Song pfTen = new Song(albumOne, "Eclipse", "https://open.spotify.com/track/1tDWVeCR9oWGX8d5J9rswk?si=14d8a497c5c44e73", "2:10", 4);
        pfTen.addComment("Amazing song! Highly recommend everyone listens to this track at least once.");
        songRepo.save(pfTen);

        // ALBUM = TITLE, ARTIST, URL, LABEL, RATING

        Album carter3 = new Album("Tha Carter III", "Lil Wayne", "https://images-na.ssl-images-amazon.com/images/I/7182e20qf6L._SL1400_.jpg", "Young Money/Cash Money", 5);
        carter3.addComment("2008's Grammy winning Rap album, going platinum in a single week. It is also featured on Rolling Stone’s list of the 500 Greatest Albums of All Time. This album is truly one of the greatest albums of our generation.");
        carter3.addComment("'After 'Lollipop' dropped, it was my mission to work with Wayne.'- T-Pain");        
        albumStorage.saveAlbum(carter3);
        
        Song tcIII1 = new Song(carter3, "3 Peat", "https://open.spotify.com/track/58PWl2rA7lU90UBvDufzWm?si=52c0b166a7684339", "3:19", 5);
        tcIII1.addComment("3 Peat is a really great song.");
        songRepo.save(tcIII1);
        
        Song tcIII2 = new Song(carter3, "Mr. Carter", "https://open.spotify.com/artist/3nFkdlSjzX9mRTtwJOzDYB?si=8ae911b013234967", "5:16", 5);
        tcIII2.addComment("Mr. Carter is a really great song.");
        songRepo.save(tcIII2);

        Song tcIII3 = new Song(carter3, "A Milli", "https://open.spotify.com/track/6ScJMrlpiLfZUGtWp4QIVt?si=4dbbc75cc5bd48c4", "3:41", 4);
        tcIII3.addComment("A Milli is a really great song.");
        songRepo.save(tcIII3);

        Song tcIII4 = new Song(carter3, "Got Money", "https://open.spotify.com/track/6NKtO7hYNDtjGFXE858qEk?si=2343b720bb0c47d5", "4:04", 5);
        tcIII4.addComment("Got Money is a really great song.");
        songRepo.save(tcIII4);

        Song tcIII5 = new Song(carter3, "Comfortable", "https://open.spotify.com/track/6NKtO7hYNDtjGFXE858qEk?si=0d5a9cbb04c14898", "4:25", 4);
        tcIII5.addComment("Comfortable is a really great song.");
        songRepo.save(tcIII5);
        
        Song tcIII6 = new Song(carter3, "Dr. Carter", "https://open.spotify.com/track/3QjQ9c1ooHiJDCqrKGC9fK?si=e776edf55238449d", "4:24", 5);
        tcIII6.addComment("Dr. Carter is a really great song.");
        songRepo.save(tcIII6);

        Song tcIII7 = new Song(carter3, "Phone Home", "https://open.spotify.com/track/2HzGcYDlF6pCgOXdXY5zXQ?si=3e9e1bca385c4c5d", "3:11", 5);
        tcIII7.addComment("Phone Home is a really great song.");
        songRepo.save(tcIII7);

        Song tcIII8 = new Song(carter3, "Tie My Hands", "https://open.spotify.com/track/3LwEvhhYpfGaIeEC3b9D2Y?si=0d4c1dc26bd5413b", "5:19", 5);
        tcIII8.addComment("Tie My Hands is a really great song.");
        songRepo.save(tcIII8);

        Song tcIII9 = new Song(carter3, "Mrs. Officer", "https://open.spotify.com/track/0EHR9OObFtjlhQB8wSt1m7?si=14d51ccbb235439f", "4:46", 5);
        tcIII9.addComment("Mrs. Officer is a really great song.");
        songRepo.save(tcIII9);
        
        Song tcIII10 = new Song(carter3, "Let The Beat Build", "https://open.spotify.com/track/0bdabO15YOj0iZPg2OujAw?si=d3c218a905344ffc", "5:09", 5);
        tcIII10.addComment("Let The Beat Build is a really great song.");
        songRepo.save(tcIII10);

        Song tcIII11 = new Song(carter3, "Shoot Me Down", "https://open.spotify.com/track/13Mh55MPFYy2O6uby9061n?si=af045b96da2d4320", "4:29", 5);
        tcIII11.addComment("Shoot Me Down is a really great song.");
        songRepo.save(tcIII11);

        Song tcIII12 = new Song(carter3, "Lollipop", "https://open.spotify.com/track/4P7VFiaZb3xrXoqGwZXC3J?si=5235d8695b0c42d1", "4:59", 5);
        tcIII12.addComment("Lollipop is a really great song.");
        songRepo.save(tcIII12);

        Song tcIII13 = new Song(carter3, "La La", "https://open.spotify.com/track/3UO64VZNLPRhfVJ20curR4?si=e0438873234849b3", "4:22", 5);
        tcIII13.addComment("La La is a really great song.");
        songRepo.save(tcIII13);
        
        Song tcIII14 = new Song(carter3, "P***y Monster", "https://open.spotify.com/track/24OKq132uA9z0LodyGzsl5?si=a13db62f432d4b40", "5:13", 4);
        tcIII14.addComment("P***y Monster is a really great song.");
        songRepo.save(tcIII14);

        Song tcIII15 = new Song(carter3, "You Ain't Got Nothin", "https://open.spotify.com/track/7fxzl4qyZBDnLkcsfire2j?si=7e927d01abc4427a", "5:27", 5);
        tcIII15.addComment("You Ain't Got Nothin is a really great song.");
        songRepo.save(tcIII15);

        Song tcIII16 = new Song(carter3, "DontGetIt", "https://open.spotify.com/track/4TpvtkyNRfDPdNNFva1Kx6?si=566b69b2314a4d56", "9:52", 5);
        tcIII16.addComment("DontGetIt is a really great song.");
        songRepo.save(tcIII16);

        
      
        Album ladyWood = new Album("Tove Lo", "Lady Wood", "https://upload.wikimedia.org/wikipedia/en/thumb/f/fd/Tove_Lo_-_Lady_Wood.png/220px-Tove_Lo_-_Lady_Wood.png", "Golden Age", 5);
        ladyWood.addComment("#girlpower.");
        ladyWood.addComment("This is a great album by Tove Lo.");        
        albumStorage.saveAlbum(ladyWood);
        
        Song lW1 = new Song(ladyWood, "Fairy Dust - Chapter I", "https://open.spotify.com/track/3OItRxmxxz2bO58PgW1iif?si=7e8b1d3bc1c24027", "0:57", 5);
        lW1.addComment("Fairy Dust is the intro to the album and is a really great song.");
        songRepo.save(lW1);
        
        Song lW2 = new Song(ladyWood, "Influence", "https://open.spotify.com/track/6IFwG4pnVPcpwX4kXFUbsV?si=484311de40734813", "3:44", 5);
        lW2.addComment("Influence is a really great song.");
        songRepo.save(lW2);
        
        Song lW3 = new Song(ladyWood, "Lady Wood", "https://open.spotify.com/track/5cB9BlseQteklXaJjRtZti?si=17a30c3baeaa4c51", "3:36", 5);
        lW3.addComment("Lady Wood is a really great song.");
        songRepo.save(lW3);

        Song lW4 = new Song(ladyWood, "True Disaster", "https://open.spotify.com/track/6s7PleW93OfE3YnujL9yxw?si=7f860e973ea44272", "3:24", 5);
        lW4.addComment("True Disaster is a really great song.");
        songRepo.save(lW4);

        Song lW5 = new Song(ladyWood, "Cool Girl", "https://open.spotify.com/track/3tJ4y2Zqx6gM9xOAuFfsSF?si=0783bcaa7e024e20", "3:19", 5);
        lW5.addComment("Cool Girl is a really great song.");
        songRepo.save(lW5);

        Song lW6 = new Song(ladyWood, "Vibes", "https://open.spotify.com/track/1bqn02WZfXZNgoh63cBgkB?si=ad4cd5691b00401b", "3:46", 5);
        lW6.addComment("Vibes is a really great song.");
        songRepo.save(lW6);

        Song lW7 = new Song(ladyWood, "Fire Fade - Chapter II", "https://open.spotify.com/track/0AvLvETftL0PRYswztXsiM?si=b21d06721cd34a26", "0:52", 5);
        lW7.addComment("Fire Fade - Chapter II is a really great song.");
        songRepo.save(lW7);

        Song lW8 = new Song(ladyWood, "Don't Talk About It", "https://open.spotify.com/track/073A1FsNWqMxmdcRMeU57t?si=332f49476323489c", "3:54", 5);
        lW8.addComment("Don't Talk About It is a really great song.");
        songRepo.save(lW8);
        
        Song lW9 = new Song(ladyWood, "Imaginary Friend", "https://open.spotify.com/track/79NqxckK3lcOV0DTVXPuEE?si=95c0bf607c544737", "4:12", 5);
        lW9.addComment("Imaginary Friend is a really great song.");
        songRepo.save(lW9);

        Song lW10 = new Song(ladyWood, "Keep It Simple", "https://open.spotify.com/track/4vIClNt19EynTBe133jer3?si=9972e6e51a424803", "3:51", 5);
        lW10.addComment("Keep It Simple is a really great song.");
        songRepo.save(lW10);

        Song lW11 = new Song(ladyWood, "Flashes", "https://open.spotify.com/track/6iejlH2IrAmsvjfgjlaq9Z?si=b90d60cf210e4fd1", "4:16", 5);
        lW11.addComment("Flashes is a really great song.");
        songRepo.save(lW11);

        Song lW12 = new Song(ladyWood, "WTF Love Is", "https://open.spotify.com/track/21cZMrvY4479k2ylYX5N36?si=64155d11d6c24cda", "3:41", 5);
        lW12.addComment("WTF Love Is is a really great song.");
        songRepo.save(lW12);


        
        Album albumPurpleRain = new Album("Purple Rain", "Prince", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9c/Princepurplerain.jpg/220px-Princepurplerain.jpg", "Warner Bros", 5);
        albumPurpleRain.addComment("Great Album");
        albumPurpleRain.addComment("Iconic sound");
        albumStorage.saveAlbum(albumPurpleRain);
        
        Song albumPurpleRainSong1 = new Song(albumPurpleRain, "Let's Go Crazy", "https://open.spotify.com/track/0QeI79sp1vS8L3JgpEO7mD?si=152dbece301a4f4f", "4:40", 3);
        albumPurpleRainSong1.addComment("This is a moving song");
        songRepo.save(albumPurpleRainSong1);
        

        Song albumPurpleRainSong2 = new Song(albumPurpleRain, "Take Me with U", "https://open.spotify.com/track/765k9tDIFOnoOfkO2cgitB?si=95d4ae8da4994f31", "3:54", 2);
        albumPurpleRainSong2.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong2);
        

        Song albumPurpleRainSong3 = new Song(albumPurpleRain, "The Beautiful Ones", "https://open.spotify.com/track/1BNtFSws7fjbn9aVBPA79j?si=6332c9b6c8814e8a", "5:13", 2);
        albumPurpleRainSong3.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong3);
        

        Song albumPurpleRainSong4 = new Song(albumPurpleRain, "Computer Blue", "https://open.spotify.com/track/3rNCkAhv9cASYco3kC9q3D?si=c2219dcb36d849eb", "3:59", 2);
        albumPurpleRainSong4.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong4);
        

        Song albumPurpleRainSong5 = new Song(albumPurpleRain, "Darling Nikki", "https://open.spotify.com/track/0khi86hc79RfsRC0rrkkA2?si=2ffc54b067eb45e0", "4:14", 2);
        albumPurpleRainSong5.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong5);
        

        Song albumPurpleRainSong6 = new Song(albumPurpleRain, "When Dove Cry", "https://open.spotify.com/track/51H2y6YrNNXcy3dfc3qSbA?si=da3c22e4345e434e", "5:52", 2);
        albumPurpleRainSong6.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong6);
        

        Song albumPurpleRainSong7 = new Song(albumPurpleRain, "I Would Die 4 U", "https://open.spotify.com/track/6fBwVe6udYdnRqwqo06if8?si=02dba3c8638940fb", "2:58", 2);
        albumPurpleRainSong7.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong7);
        

        Song albumPurpleRainSong8 = new Song(albumPurpleRain, "Baby I'm a Star", "https://open.spotify.com/track/2soBvUQBf5rbMj9HIyhzzK?si=f972b8461e6b49d9", "3:24", 2);
        albumPurpleRainSong8.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong8);
        

        Song albumPurpleRainSong9 = new Song(albumPurpleRain, "Purple Rain", "https://open.spotify.com/track/54X78diSLoUDI3joC2bjMz?si=33b699f15a5e4f0e", "8:40", 5);
        albumPurpleRainSong9.addComment("Soup is good food.");
        songRepo.save(albumPurpleRainSong9);
        



        Album albumClaudeBolling = new Album("Claude Bolling's Suite for Cello and Jazz Piano Trio", "Claude Bolling and Yo-Yo Ma", "https://images-na.ssl-images-amazon.com/images/I/81VqInezrjL._SX425_.jpg", "CBS Masterworks", 5);
        albumClaudeBolling.addComment("Great Jazz");
        albumClaudeBolling.addComment("Surprised me that there was ano bassoon solo.");
        albumStorage.saveAlbum(albumClaudeBolling);

        Song albumClaudeBollingSong1 = new Song(albumClaudeBolling, "Suite for Cello and Jazz Piano Trio I. Baroque In Rhythm", "https://open.spotify.com/track/5318LdRm6mBZiWVcbVGKlB?si=14c568c3d1444c21", "4:19", 5);
        albumClaudeBollingSong1.addComment("Great Strings.");
        songRepo.save(albumClaudeBollingSong1);
        

        Song albumClaudeBollingSong2 = new Song(albumClaudeBolling, "Suite for Cello and Jazz Piano Trio II. Concertante", "https://open.spotify.com/track/6hLVaODH30oB90ItaQV0QM?si=b152eff5389f4781", "11:50", 5);
        albumClaudeBollingSong2.addComment("Got to love all the ivory.");
        songRepo.save(albumClaudeBollingSong2);
        

        Song albumClaudeBollingSong3 = new Song(albumClaudeBolling, "Suite for Cello and Jazz Piano Trio III. Galop", "https://open.spotify.com/track/4VjayHNTbVODyBgpEW6WnV?si=2cb4774212194c42", "8:40", 5);
        albumClaudeBollingSong3.addComment("Great fret work.");
        songRepo.save(albumClaudeBollingSong3);
        

        Song albumClaudeBollingSong4 = new Song(albumClaudeBolling, "Suite for Cello and Jazz Piano Trio IV. Ballade", "https://open.spotify.com/track/7fddQ1T3TuNsnohEONa3LJ?si=9d072f2783f74cbf", "9:30", 5);
        albumClaudeBollingSong4.addComment("What a sound board.");
        songRepo.save(albumClaudeBollingSong4);
        

        Song albumClaudeBollingSong5 = new Song(albumClaudeBolling, "Suite for Cello and Jazz Piano Trio V. Romantique", "https://open.spotify.com/track/3ZoxFe2Dby2U6k3bmV2xhm?si=579a7ec1fbf44c00", "8:29", 5);
        albumClaudeBollingSong5.addComment("Reminds me of a dive bar in New York.");
        songRepo.save(albumClaudeBollingSong5);
        
        
        Song albumClaudeBollingSong6 = new Song(albumClaudeBolling, "Suite for Cello and Jazz Piano Trio VI. Cello Fan", "https://open.spotify.com/track/2hFNOmS2pchhYRq0QrkIKr?si=735fd6385dcd4e59", "6:45", 5);
        albumClaudeBollingSong6.addComment("Great trio.");
        songRepo.save(albumClaudeBollingSong6);
        



        Album plugsIMet2 = new Album("The Plugs I Met 2", "Benny the Butcher, Harry Fraud", "https://media.pitchfork.com/photos/605124eb17cb1de7bbdb7bf4/1:1/w_600/Benny%20the%20Butcher%20&%20Harry%20Fraud:%20The%20Plugs%20I%20Met%202.jpeg", "Black Soprano Family", 5);
        plugsIMet2.addComment("Great Album");
        plugsIMet2.addComment("Iconic sound");
        albumStorage.saveAlbum(plugsIMet2);
        
        Song plugs1 = new Song(plugsIMet2, "When Tony Met Sosa", "https://open.spotify.com/track/4ahc42KacGWjE3j0DPNSK5?si=5f1ff593fe864028", "2:21", 4);
        plugs1.addComment("This is a moving song");
        songRepo.save(plugs1);
        

        Song plugs2 = new Song(plugsIMet2, "Overall", "https://open.spotify.com/track/0gqGG4IiuGwFqECqDyubjE?si=3dc8abb70e5d4df8", "3:25", 5);
        plugs2.addComment("Soup is good food.");
        songRepo.save(plugs2);
        

        Song plugs3 = new Song(plugsIMet2, "Plug Talk", "https://open.spotify.com/track/3kKfpZ1Lwf5bG2t6mHbSOw?si=06c901e48422481d", "3:15", 4);
        plugs3.addComment("Soup is good food.");
        songRepo.save(plugs3);
        

        Song plugs4 = new Song(plugsIMet2, "Live By It", "https://open.spotify.com/track/4BbKdA6szsCVCpLtlKKbX4?si=c8ba2bcfc6b748f4", "2:51", 3);
        plugs4.addComment("Soup is good food.");
        songRepo.save(plugs4);
        

        Song plugs5 = new Song(plugsIMet2, "Talkin' Back", "https://open.spotify.com/track/0Bj62CkpsaMZJwgqZ0UbPc?si=c39ea8439c534845", "2:42", 4);
        plugs5.addComment("Soup is good food.");
        songRepo.save(plugs5);
        

        Song plugs6 = new Song(plugsIMet2, "No Instructions", "https://open.spotify.com/track/7qnn9zX7YOJd618Nyuv0oa?si=5331c78a0e114e42", "3:38", 4);
        plugs6.addComment("Soup is good food.");
        songRepo.save(plugs6);
        

        Song plugs7 = new Song(plugsIMet2, "Longevity", "https://open.spotify.com/track/2F5Qt3PMfiqm1rL9KwkTQa?si=c374db9345d44594", "4:00", 3);
        plugs7.addComment("Soup is good food.");
        songRepo.save(plugs7);
        

        Song plugs8 = new Song(plugsIMet2, "Survivor's Remorse", "https://open.spotify.com/track/0uNConQbWsWTksC4y3Alnv?si=b277503728334ddf", "3:41", 4);
        plugs8.addComment("Soup is good food.");
        songRepo.save(plugs8);
        

        Song plugs9 = new Song(plugsIMet2, "Thanksgiving", "https://open.spotify.com/track/4cS5OI6hxWVp4PEeAppMIv?si=2be8fa3211534339", "2:30", 5);
        plugs9.addComment("Soup is good food.");
        songRepo.save(plugs9);
        



        Album obzen = new Album("Obzen", "Meshuggah", "https://kys-cdn.s3.ap-southeast-1.amazonaws.com/kysadmn/wp-content/uploads/2018/03/11120619/81OxHrzBAvL._SL1500_-1024x903.jpg", "Nuclear Blast", 5);
        obzen.addComment("Great Album");
        obzen.addComment("Iconic sound");
        albumStorage.saveAlbum(obzen);
        
        Song bleed1 = new Song(obzen, "Combustion", "https://open.spotify.com/track/67FLsDJIE22Rc6lWUIPPsD?si=680a6944e2094560", "4:08", 4);
        bleed1.addComment("This is a moving song.");
        songRepo.save(bleed1);
        

        Song bleed2 = new Song(obzen, "Electric Red", "https://open.spotify.com/track/2Hmg7VIDAum3OiAv6k0q9W?si=2caa8fce26564f72", "5:51", 5);
        bleed2.addComment("Soup is good food.");
        songRepo.save(bleed2);
        

        Song bleed3 = new Song(obzen, "Bleed", "https://open.spotify.com/track/7J4yQt7P7XExNeljWEvt2D?si=cfbb1195f5494b9a", "7:22", 5);
        bleed3.addComment("One of the greatest songs of all time.");
        songRepo.save(bleed3);
        

        Song bleed4 = new Song(obzen, "Lethargica", "https://open.spotify.com/track/2lRt1HzIBO0UyZcsIBfhOF?si=51bf6b24bb164027", "5:47", 5);
        bleed4.addComment("Soup is good food.");
        songRepo.save(bleed4);
        

        Song bleed5 = new Song(obzen, "Obzen", "https://open.spotify.com/track/5VWYJhGyzbmsJFNQtHdxNu?si=df8babe25def457c", "4:24", 4);
        bleed5.addComment("Soup is good food.");
        songRepo.save(bleed5);
        

        Song bleed6 = new Song(obzen, "This Spiteful Snake", "https://open.spotify.com/track/2yxAAU2xKo2Z04Se01J4Bq?si=c47a565482ad44cb", "4:52", 4);
        bleed6.addComment("Soup is good food.");
        songRepo.save(bleed6);
        

        Song bleed7 = new Song(obzen, "Pineal Gland Optics", "https://open.spotify.com/track/2SLDg140IojshHBzmKrzNx?si=1b8ba9485c8e4fcf", "5:12", 3);
        bleed7.addComment("Soup is good food.");
        songRepo.save(bleed7);
        

        Song bleed8 = new Song(obzen, "Pravus", "https://open.spotify.com/track/5EbjBpXxQsS6SXZr7qzgI1?si=3eab5fe9a4a14460", "5:10", 4);
        bleed8.addComment("Soup is good food.");
        songRepo.save(bleed8);
        

        Song bleed9 = new Song(obzen, "Dancers to a Discordant System", "https://open.spotify.com/track/6mi94ysIFFasfpwUNquwqM?si=a824112259a445d8", "9:36", 5);
        bleed9.addComment("Soup is good food.");
        songRepo.save(bleed9);
        



        Album motion = new Album("Motion", "Calvin Harris", "https://upload.wikimedia.org/wikipedia/en/f/fb/Calvin_Harris_-_Motion.png", "Columbia Records", 4);
        motion.addComment("Great album.");
        motion.addComment("Fun times.");        
        albumStorage.saveAlbum(motion);
        
        Song motion1 = new Song(motion, "Faith", "https://open.spotify.com/track/0ZmkjefPVLvloVSgtmRu5M?si=c58d49ae0c744c81", "3:39", 5);
        motion1.addComment("This is a really great song.");
        songRepo.save(motion1);
        
        Song motion2 = new Song(motion, "Under Controle", "https://open.spotify.com/track/4J7CKHCF3mdL4diUsmW8lq?si=225ecda1d5f04e38", "3:04", 5);
        motion2.addComment("This is a really great song.");
        songRepo.save(motion2);

        Song motion3 = new Song(motion, "Blame", "https://open.spotify.com/track/07nH4ifBxUB4lZcsf44Brn?si=b04bec741d5a4678", "3:32", 4);
        motion3.addComment("This is a really great song.");
        songRepo.save(motion3);

        Song motion4 = new Song(motion, "Love Now", "https://open.spotify.com/track/5vQctmBxi79lyQoc2DDAsP?si=a825fe4d857e4aae", "3:38", 5);
        motion4.addComment("This is a really great song.");
        songRepo.save(motion4);

        Song motion5 = new Song(motion, "Slow Acid", "https://open.spotify.com/track/6GvXJZ8EQuUWzthpPFLr6f?si=4ad37f7382a54483", "3:41", 4);
        motion5.addComment("This is a really great song.");
        songRepo.save(motion5);
        
        Song motion6 = new Song(motion, "Outside", "https://open.spotify.com/track/7MmG8p0F9N3C4AXdK6o6Eb?si=ac019505d54f4db6", "3:47", 5);
        motion6.addComment("This is a really great song.");
        songRepo.save(motion6);

        Song motion7 = new Song(motion, "It Was You", "https://open.spotify.com/track/57EMMRviFnUVwYgsHgAlA2?si=f1789ad6f093403a", "3:44", 5);
        motion7.addComment("This is a really great song.");
        songRepo.save(motion7);

        Song motion8 = new Song(motion, "Summer", "https://open.spotify.com/track/6YUTL4dYpB9xZO5qExPf05?si=2c76bcca92ee40c9", "3:42", 5);
        motion8.addComment("This is a really great song.");
        songRepo.save(motion8);

        Song motion9 = new Song(motion, "Overdrive", "https://open.spotify.com/track/07BCFbk1oCwf80lemfyzK6?si=edaf39f5dd4346b2", "4:51", 5);
        motion9.addComment("This is a really great song.");
        songRepo.save(motion9);
        
        Song motion10 = new Song(motion, "Ecstasy", "https://open.spotify.com/track/4NH6M9tsx1dXL58zZTmTYE?si=bbcfc9e4aa544d13", "3:41", 5);
        motion10.addComment("This is a really great song.");
        songRepo.save(motion10);

        Song motion11 = new Song(motion, "Pray to God", "https://open.spotify.com/track/75kMrDKPJJpgEQaXVh7QMB?si=26553a1dfef64110", "3:52", 5);
        motion11.addComment("This is a really great song.");
        songRepo.save(motion11);

        Song motion12 = new Song(motion, "Open Wide", "https://open.spotify.com/track/64j3Bd62HTe0pclk8Aq9BE?si=4b12632d8d8f4305", "3:07", 5);
        motion12.addComment("This is a really great song.");
        songRepo.save(motion12);

        Song motion13 = new Song(motion, "Together", "https://open.spotify.com/track/0otmDG441slQ7QYZUPgBcM?si=fb26f1d2dde24d5a", "3:38", 5);
        motion13.addComment("This is a really great song.");
        songRepo.save(motion13);
        
        Song motion14 = new Song(motion, "Burnin", "https://open.spotify.com/track/5lByoyTJti3jYo22bLQKOH?si=df7e774899ff4559", "3:54", 4);
        motion14.addComment("This is a really great song.");
        songRepo.save(motion14);

        Song motion15 = new Song(motion, "Dollar Signs", "https://open.spotify.com/track/7sUrtg1AYRyrDECLqq6no9?si=37075fa83b6a48e4", "3:56", 5);
        motion15.addComment("This is a really great song.");
        songRepo.save(motion15);




        Album tRS = new Album("The Roaring Silence", "Manfred Mann's Earth Band", "https://i.scdn.co/image/ab67616d0000b273716609e2f2f9069d7d44bf93", "Bronze Records", 5);
        tRS.addComment("Great Album");
        tRS.addComment("Iconic sound");
        albumStorage.saveAlbum(tRS);
        
        Song mMEB1 = new Song(tRS, "Blinded By The Lighht", "https://open.spotify.com/track/7kNNylJ1kswWbHeRM6UDuE?si=f72448dcaa994b75", "7:08", 5);
        plugs1.addComment("This is a moving song, seriously amazing song. ");
        songRepo.save(mMEB1);
        

        Song mMEB2 = new Song(tRS, "Singing The Dolphin Through", "https://open.spotify.com/track/6eEeWdXXomI4POwghTEBUF?si=51b2b116ca1c4861", "8:19", 5);
        mMEB2.addComment("Soup is good food.");
        songRepo.save(mMEB2);
        

        Song mMEB3 = new Song(tRS, "Waiter There's a Yawn In My Ear", "https://open.spotify.com/track/52t1mJ0zSKYt308Zs1vQ9r?si=9aa1d27baffd48be", "5:38", 5);
        mMEB3.addComment("One of the greatest songs of all time.");
        songRepo.save(mMEB3);
        

        Song mMEB4 = new Song(tRS, "The Road to Babylon", "https://open.spotify.com/track/7cUBAZwaFjPkdEkFMAGy7Y?si=277a2113edff4542", "6:52", 5);
        mMEB4.addComment("Soup is good food.");
        songRepo.save(mMEB4);
        

        Song mMEB5 = new Song(tRS, "This Side Of Paradice", "https://open.spotify.com/track/2FlebT1Mc2EKhNgbY9oGb1?si=9d8a47621fef47db", "4:47", 4);
        mMEB5.addComment("Soup is good food.");
        songRepo.save(mMEB5);
        

        Song mMEB6 = new Song(tRS, "Starbird", "https://open.spotify.com/track/2NYNewtl23Vhu9MSqa9RQE?si=c264b14aefde4319", "3:09", 4);
        mMEB6.addComment("Soup is good food.");
        songRepo.save(mMEB6);
        

        Song mMEB7 = new Song(tRS, "Questions", "https://open.spotify.com/track/4MxcSuiST4oWg2CgV0j0wM?si=cb2ff4fb26874cc0", "3:59", 3);
        mMEB7.addComment("Soup is good food.");
        songRepo.save(mMEB7);
        

        Song mMEB8 = new Song(tRS, "Spirits In The Night", "https://open.spotify.com/track/7hQTCFsdtl8nNnpY4akycC?si=446de4d0e61a47a6", "3:15", 4);
        mMEB8.addComment("Soup is good food.");
        songRepo.save(mMEB8);
        

    }

}
