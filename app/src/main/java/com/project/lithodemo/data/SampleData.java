package com.project.lithodemo.data;

import java.util.ArrayList;

import static com.project.lithodemo.config.Config.HAS_WEB_CONTENT;
import static com.project.lithodemo.data.Article.DisplayType.LARGE_IMAGE;
import static com.project.lithodemo.data.Article.DisplayType.SMALL_IMAGE;
import static com.project.lithodemo.data.Article.DisplayType.TEXT_ONLY;
import static com.project.lithodemo.data.Article.DisplayType.THREE_IMAGES;
import static com.project.lithodemo.data.Article.DisplayType.WEB;

public class SampleData {

    public SampleData() {

    }

    public ArrayList<Article> get() {
        ArrayList<Article> data = new ArrayList<>();
        data.add(new Article("《NieR:Automata》中文版攻略　主線劇情:一周目Ch02 抵抗軍營", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87615/thumbnail/c33ed6ea522367a1a44e120814823eb8.jpg"}));
        data.add(new Article("DQ XI勇者洛特藍色PS4限定主機　史萊姆球型手掣　", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87604/thumbnail/6b296b6ef123ff138aabc294b59df6a5.jpg"}));
        data.add(new Article("【打機．博評】FIFA與Winning：你轉會了嗎？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86383/thumbnail/826c5fcea46fe7e30202bcd5e2ebe124.jpg"}));
        data.add(new Article("《NieR Automata》中文版攻略　必學6種隱藏招式", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87542/thumbnail/7adc288cb411b1996c5a512aa288f925.jpg"}));
        data.add(new Article("4.29-30玩具開倉　$200萬能俠超合金　$390MG EX-S高達", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87575/thumbnail/7848f1a1e895dad693cf90d5e0f2e01b.jpg"}));
        data.add(new Article("小嶋陽菜單飛初登 GirlsAward　誓破AKB畢業生收入激減現象", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87461/thumbnail/b49e0b0ed09e97ae87b3aefcd075548c.jpg"}));
        data.add(new Article("【高達迷睇車】BANDAI出馬沙專用公路單車　三倍速掉落河？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87321/thumbnail/e2bfa5f6f7e4db8eadef449b0f6027fc.jpg"}));
        data.add(new Article("《NieR:Automata》中文版攻略　主線劇情:一周目Ch01 序章", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87348/thumbnail/a2594ceb25529846bb47171150907dd4.jpg"}));
        data.add(new Article("打機真係冇乜用，但點解每一分鐘都要咁有用？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86627/thumbnail/76ee92c74de2ffc83ed328774fdbd193.jpg"}));
        data.add(new Article("《草莓100％ East  side story》　東城綾的愛情物語上線了！", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87286/thumbnail/5e552bfb26bbde06745defce0ed34800.jpg"}));
        data.add(new Article("化身成悟空、布歐、撒亞人玩轉Facebook？！簡單自製《龍珠》角色", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87438/thumbnail/07dfe502e4b9d6eaf05a3230950ce072.jpg"}));
        data.add(new Article("【高達髮廊】日本藝人都愛「紅彗星」　72歲老伯自製3米高馬沙機", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87174/thumbnail/ac5ac3db4590130315913ba3857b4afd.jpg"}));
        data.add(new Article("【來稿】從芒亨說起：當打機不再是一條友匿埋喺屋企", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87079/thumbnail/78e17bdeb424dee69921206bf3cf5b8c.jpg"}));
        data.add(new Article("《陰陽師》學界分享會　浸大同學搶住現世召喚巨大式神", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87086/thumbnail/3f33cf2fd089ed170dc164390fb02835.jpg"}));
        data.add(new Article("點解學生鍾意打機多過讀書？因為失敗一樣有趣", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86376/thumbnail/dcd48394ff6debf644d44346349c42e2.jpg"}));
        data.add(new Article("Plantronics BackBeat FIT一體式運動耳機　充電15分鐘用1小時", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86926/thumbnail/af491531e010ed97a6601780169f0b08.jpg"}));
        data.add(new Article("Samsung S8拍攝功能現場速測　試玩最新面容解鎖", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87085/thumbnail/41cac2224ff7813d7cf32773412d0e5a.jpg"}));
        data.add(new Article("Mario Kart 8 deluxe自動轉彎踩油門　新手都可變拓海！", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86792/thumbnail/ec2d3cccdbfceac4b8d0ddd3fddaabac.jpg"}));
        data.add(new Article("UNDEFEATED創辦人James Bond：最喜愛的鞋履是.......", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85178/thumbnail/8f6e2bc2a63e1c24e24b0b82acb574a8.jpg"}));
        data.add(new Article("【Zelda攻略】薩爾達荒野之息　FANS製詳盡地圖 自選所需自由縮放", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87061/thumbnail/aa32edc3abf5aeb6f1b97780c42e7506.jpg"}));
        data.add(new Article("【AKB48總選】注目の100人小背心上陣　渡邊麻友清純碎花賣氣質", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87042/thumbnail/cf9cd1118388608a2a5831a5f3272c75.jpg"}));
        data.add(new Article("【乃木坂46寫真．多圖】衛藤美彩自封臀王　潛力股硬撼白石麻衣", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87019/thumbnail/17971076f0722e9ef21d08a6d2ff2979.jpg"}));
        data.add(new Article("FF VII remake版Cloud　Play Arts 改人偶型格圖集", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/87031/thumbnail/199d1cddcfa1b9983b7654bea25458f9.jpg"}));
        data.add(new Article("Samsung Galaxy S8、S8+行貨抵港速報　林海峰撐場唱好（有片）", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86819/thumbnail/627fd78223b316009b1661f103759a24.jpg"}));
        data.add(new Article("港行PS4跟機送4款實體大作加PS Plus　勁抵送Horizon及人中之龍6", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86883/thumbnail/53ac1a5b1c2b3588784da9c7b4c45df2.jpg"}));
        data.add(new Article("Mario Kart 8 deluxe　Switch一機4打新車激試", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86707/thumbnail/7db93caa8186debb88278d309160c852.jpg"}));
        data.add(new Article("玩Mario Kart 8 deluxe前必睇　機連機8人對戰　一圖睇盡所需器材", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86780/thumbnail/83da20217039a052ba8c78bfab85cb92.jpg"}));
        data.add(new Article("《時空之門》5月停止更新　官方公告年末結束營運", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86742/thumbnail/d6361394f544f49d6873630dc70df8ab.jpg"}));
        data.add(new Article("【Zelda攻略】薩爾達荒野之息主線：攻略海拉爾城＆加農最終決戰", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86524/thumbnail/b4f9fb1a357c6e8ad862ba8bdf1c54b8.jpg"}));
        data.add(new Article("《動物朋友》宣布再度手機遊戲化　完全新作夏季復活", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86484/thumbnail/6681df64e6220c80718187fe27ef3f06.jpg"}));
        data.add(new Article("【谷阿莫被告】首次被片商控告　谷阿莫拍片解釋二次創作合理權", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86523/thumbnail/76e1f0914ae1a192a42429a2ba6ce230.jpg"}));
        data.add(new Article("《高達 鐵血的弧兒》狼王巴巴托司模型神級示範　3D扮2D神技再現", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86472/thumbnail/fec2ee6f79895146c18220bf61bdd24a.jpg"}));
        data.add(new Article("RG19同人即賣會活動後感：平淡而賣氣不足　似乎需要有新突破", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86396/thumbnail/269d0d4bbc82f7571f12561124f80c33.jpg"}));
        data.add(new Article("【動感女神】韓國長板女神高孝周　中環街頭釋放陽光活力", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86269/thumbnail/518a0e33a5bfaa71b4a2a8d7aaab9827.jpg"}));
        data.add(new Article("瑞士RhB鐵道起用動漫角色宣傳　箱根版列車載客參加日本動漫之夜", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86208/thumbnail/6bca94039450f881c1790739607ae4c7.jpg"}));
        data.add(new Article("Bose SoundSports Pulse VS UA Sport Wireless：運動耳機大比併", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86023/thumbnail/eb91ce430a55bfc3cce57e5595efd679.jpg"}));
        data.add(new Article("Mario Kart 8 Deluxe推出在即　美國Target百貨店內玩真人孖車", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86057/thumbnail/4a47f5e36e11e729ced039f309a78c42.jpg"}));
        data.add(new Article("【毒女愛情學】動漫中的夢想女神：三笠？蕾姆？六花？還是照橋？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86118/thumbnail/97d779a771070d462d0023e504824d54.jpg"}));
        data.add(new Article("《Shadowverse》闇影詩章中文化　本周發布會有望即日推出嗎？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86021/thumbnail/bc55659e203669fad884ddd09c06dde4.jpg"}));
        data.add(new Article("《薩爾達傳說》神盾斜孭袋、聖劍摺遮　一番獎助你COSPLAY林克", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85983/thumbnail/7a6ed93798b10e1f8d799dd5b263c196.jpg"}));
        data.add(new Article("PS4《GUNDAM VERSUS》官方正式公布38台首批參戰機資料", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86029/thumbnail/a8b0c1dd152a6aa903c7fe2d614f6410.jpg"}));
        data.add(new Article("萬名動漫迷公投　Top 20最想要動漫神奇超級道具", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85955/thumbnail/2e1a777065a7b688f83546cf8a89cb0c.jpg"}));
        data.add(new Article("《NieR:Automata》中文版2B現身　DLC中日同步、展示黑盒版內容", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85999/thumbnail/29615845729f4e090b2a037afc1e188f.jpg"}));
        data.add(new Article("【信和路線圖】從高橋由美子到AKB48　「漫畫之森」開啟世界大門", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/86001/thumbnail/5587a6e81b4f6b471daa0ece9657c776.jpg"}));
        data.add(new Article("Dough-Boy feat. 大豆芽社長　四不像的搪膠 x 音樂企劃", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85902/thumbnail/79051ce2f62509ce8058eccc05ce8ad2.jpg"}));
        data.add(new Article("【Zelda攻略】薩爾達荒野之息　簡單快刷雷龍/火龍/冰龍珍貴素材", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85737/thumbnail/33954209a3347862e33699b1096d49cc.jpg"}));
        data.add(new Article("Dyson UK半價買V8吸塵機兼送AM06無葉風扇　英國網購值得搶嗎？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85863/thumbnail/f729dc8eabfb7135f0ed5b1053ff1ecf.jpg"}));
        data.add(new Article("【郭富城都愛紅煲呔】名偵探柯南新戲大賣　USJ解謎GAME熱玩到6月", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85835/thumbnail/73c136a25b449ba4c428a898d10b6b5c.jpg"}));
        data.add(new Article("《虐殺器官》電影版（送戲飛）　伊藤計劃Project Itoh神作映畫化", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85724/thumbnail/ead51e3f6c133943f8a4a0bf3d2fd714.jpg"}));
        data.add(new Article("全紅潮物列陣　Apple (PRODUCT)RED iPhone以外更多選擇", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84809/thumbnail/c7590143761a479f26ad95eb3bcfd622.jpg"}));
        data.add(new Article("Fitbit Alta HR兩代比拼：增心跳感應、深度分析睡眠質素", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85689/thumbnail/72b790a97b2768bdcd06ba2f0b79a877.jpg"}));
        data.add(new Article("Samsung S8抵港搶先玩勁靚曲芒　韓劇悄悄話、完美的妻子早已預玩", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85662/thumbnail/34819ffe5c673d2ef4e4324620965860.jpg"}));
        data.add(new Article("【進擊的巨人】巨人突擊池袋天像影院　360度超壓迫大包圍", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85587/thumbnail/051482cbd7c323636699e036c5be5636.jpg"}));
        data.add(new Article("迷你超級任天堂Super Famicom mini本年內登場", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85580/thumbnail/d5a993d1144301de3982e5d7dbcbb07c.jpg"}));
        data.add(new Article("【AKB48清洗80後．多圖】小嶋陽菜含淚畢業　宮脇咲良獲力捧上位", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85577/thumbnail/a76b2b8a1f3b1282d85117ed7a8c054b.jpg"}));
        data.add(new Article("Sony A9真正專業級無反相機登場　超高速對焦、連拍加持（有片）", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85510/thumbnail/e47e225d0771e38507b4e4757a38cbaf.jpg"}));
        data.add(new Article("Starcraft連資料片即日起免費下載　有齊PC及MAC版", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85425/thumbnail/44c676d6ec233063ecc7731edfa9651f.jpg"}));
        data.add(new Article("【葉繼歡病逝】竟是桂正和粉絲？新年賀卡原圖深入考證", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85462/thumbnail/9fb5d93880dedd13741242a412ccc55d.jpg"}));
        data.add(new Article("【Zelda攻略】薩爾達荒野之息主線：全12+1張相片回憶位置", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85238/thumbnail/40711ab2a16d5ba3a01f33e080a67b34.jpg"}));
        data.add(new Article("【AiKaBu】AKB48模擬股市手遊　做彩姐指原大股東！", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85239/thumbnail/1ee59553ee9454c676d8c45ee5def199.jpg"}));
        data.add(new Article("【F8大會】Facebook新功能　如《刀劍神域》般玩盡VR、AR世界", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85347/thumbnail/f71208f1e2b776f0358aa01693b3a04d.jpg"}));
        data.add(new Article("美國PS4 Slim容量加倍至1TB加量不加價　香港會否跟著減？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85282/thumbnail/ea842d2320f59536826abf20d84001ca.jpg"}));
        data.add(new Article("《伊蘇8》PS4中文版初回特典　送設定集及閃之軌跡Ⅲ秘藏資料集", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85472/thumbnail/ad9b5b87a3c7bd2410874755047d4a99.jpg"}));
        data.add(new Article("《銀河守護隊2》12吋6吋星爵人偶同步發布", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85219/thumbnail/297e92f28c3a2326ff78b82e6d5d8533.jpg"}));
        data.add(new Article("Switch《Ultra Street Fighter II》新片．詳解七大新玩法", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/85067/thumbnail/3c49642f93222ef0c05610549d3e0ef6.jpg"}));
        data.add(new Article("《NieR:Automata尼爾自動人形》新DLC　可用初代服裝及可挑戰社長", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84984/thumbnail/c1216ebfbe240e921f5cf130f8e4f454.jpg"}));
        data.add(new Article("【宅毒救星】《魔獸》玩家潛藏5大成功元素　隨時變身職場贏家", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84963/thumbnail/a897ba6c78998ea7a663a2f481af5cd1.jpg"}));
        data.add(new Article("【進擊的巨人】Tokyo Sky Tree進擊的巨塔　教你遊晴空塔打卡換禮", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84975/thumbnail/2a0f8264d0547545dcb5da5fa108a87c.jpg"}));
        data.add(new Article("【進擊的巨人】記者親赴Tokyo Sky Tree試玩　450米買巨人限定品", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84901/thumbnail/ac786313236a203e62afdbb224409004.jpg"}));
        data.add(new Article("LOVELIVE！新計劃「PERFECT DREAM PROJECT」　手遊N卡偶像再利用", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84932/thumbnail/57301fea54fe296568da6a67c63c4925.jpg"}));
        data.add(new Article("GUNDAM VERSUS新片　雷姆卡碧尼Turn X閃電高達座天使參戰", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84785/thumbnail/ea9a49330e83fe6e6edcdf13a4389254.jpg"}));
        data.add(new Article("【 狂野時速8溝埋Mario Kart 8 】惡搞預告片　變身荷里活大電影", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84729/thumbnail/c4add4e61f546c35d148c53fa6a6dd5b.jpg"}));
        data.add(new Article("《另一個伊甸 跨越時空的貓》單機手遊試玩評價：超任RPG迷必試", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84575/thumbnail/4524c69076672f94aa096ed7af4c9457.jpg"}));
        data.add(new Article("Switch《閃亂神樂》JOY CON觸感竟是任天堂發布會最多人看的影片", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84308/thumbnail/a97e1778e0c7eb25b75f44fa2d77890b.jpg"}));
        data.add(new Article("LINE百變熊大Brown　萌爆變身馬卡龍流動電池", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84585/thumbnail/4f6168cf42b31f4572436221be803367.jpg"}));
        data.add(new Article("Pokemon GO復活節孵蛋活動　2KM及5KM珍貴小精靈列表", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84528/thumbnail/253188f68c3e2ada3a90727b76ee7437.jpg"}));
        data.add(new Article("【復活節必去】二手漫畫小說嘉年華會　買十送一抵玩大開倉", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84491/thumbnail/d24a4cb1012770f143497f51d3277418.jpg"}));
        data.add(new Article("《龍珠Z》大玩VR+AR手機遊戲　虛擬世界同悟空一齊出龜波鬥菲利", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84429/thumbnail/f6c0e9b76f3a0d3168431581bfd51462.jpg"}));
        data.add(new Article("Switch《神巫女》奇奇怪界感覺　有中文字幕500日圓抵玩即買", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84327/thumbnail/e404ee21f5d88b0f29c8e88a529b94de.jpg"}));
        data.add(new Article("《進擊的巨人》舞台劇特技指導意外身亡　官方緊急中止公演", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84367/thumbnail/358f5c9adefed1415930b6eaac0fe0eb.jpg"}));
        data.add(new Article("任天堂Mini紅白機、灰機正式停產　現在是最後入手時機嗎？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84363/thumbnail/fe64445437708e634ee4524c564802d6.jpg"}));
        data.add(new Article("3DS免費課金遊戲《星之卡比獵人Z》　4人協力共鬥即日推出", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84304/thumbnail/6e9ea1b6c4f1c252075804f8f726247f.jpg"}));
        data.add(new Article("【AKB競敵】欅坂46出道1年壓力大　人氣成員今泉佑唯捱到病", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84297/thumbnail/37e5e844c02cf0bbe497d4bbfe4729da.jpg"}));
        data.add(new Article("《Mario Kart 8 Deluxe》Switch玩家必買！超刺激對戰詳解．有片", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84217/thumbnail/d46edc50cefe76f66a27cf5a2df833bb.jpg"}));
        data.add(new Article("《SPLATOON 2》漆彈大作戰終於有多人協力　4人合作打三文魚怪", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84270/thumbnail/7e594d5b8cc580450e2608ec57c16201.jpg"}));
        data.add(new Article("Meitu美圖T8　Rugby 7素人Seflie測試", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84075/thumbnail/75dc0d63287979fd40d52c64152ee423.jpg"}));
        data.add(new Article("傳蘋果秘密研發光學傳感技術多年　未來Apple Watch或可驗血糖？", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84110/thumbnail/de05f6a1621d53384aa8ba71cd794e44.jpg"}));
        data.add(new Article("【動物朋友、Soul Eater、白貓P聲優】小見川千明香港見面會", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84046/thumbnail/5a2997fd6d25a694ade23aadb63ced24.jpg"}));
        data.add(new Article("UNCHARTED獨立外傳遊戲The Lost Legacy新片及發售日公布", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84052/thumbnail/8a165d51cbb3e666e2b130a51c5335ea.jpg"}));
        data.add(new Article("FIRE EMBLEM HEROES大更新　終於增至99體力及新增「聖印」系統", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/84040/thumbnail/57062c010ef5acb03c1ff7c1a9b43718.jpg"}));
        data.add(new Article("【進擊的巨人2．追新番】莎夏顏藝升級　揭開不為人知的過去", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83597/thumbnail/61ae846de1c21bc1e8e1e3d5767ee14d.jpg"}));
        data.add(new Article("智能電話注意！指紋解鎖危機　偽造「萬能指紋」解鎖成功率達65%", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83887/thumbnail/3fca7e30c62cb6e72ef50809d1578638.jpg"}));
        data.add(new Article("新優惠app「Jetsoeye著數眼」　革新團購式優惠再現", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83809/thumbnail/b3a02475b89151f1e31a5a9fa940f323.jpg"}));
        data.add(new Article("製作「扑鱷魚機」日本兒童向街機公司破產　最後作品仍令兒童歡樂", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83790/thumbnail/cbc3bc3f75cd05d115a73535cdfb2968.jpg"}));
        data.add(new Article("【DQ XI發售日公布】Dragon Quest XI勇者鬥惡龍新片透露遊戲詳情", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83728/thumbnail/4000f98a58debdd710bbe54003f98110.jpg"}));
        data.add(new Article("One Piece X PEACH JOHN　玩具睡衣變身路飛薩波", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83568/thumbnail/5bceeb1779e7de090a65804920c8c074.jpg"}));
        data.add(new Article("1MORE E1010　超高性價比四單元圈鐵耳機　日系動漫最啱聽", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83508/thumbnail/1de5224214a4f1b6f6ce21714f0fe123.jpg"}));
        data.add(new Article("【超多圖．有片】小嶋陽菜脫離AKB　訪港會粉絲親切狂selfie", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83562/thumbnail/ecdc4c66a959e0a2046340e28c9a0a46.jpg"}));
        data.add(new Article("PERSONA 5英銷量壓下MASS EFFECT及GHOST RECON　指令式JRPG不死", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83541/thumbnail/896fde8b6094d889f76ccb8c03c961d2.jpg"}));
        data.add(new Article("《干物妹》動畫第二季製作決定　原班製作預定今年播出", SMALL_IMAGE, new String[] {"https://cdn.hk01.com/media/article/83485/thumbnail/f4a8c9d2f5a506555885b606c3c95047.jpg"}));

        for (int i=0; i<data.size(); i++) {
            if (i%15 == 0) {
                data.get(i).setDisplayType(TEXT_ONLY);
                data.get(i).setImages(null);
            }
            else if (HAS_WEB_CONTENT && i%12 == 0) {
                data.get(i).setDisplayType(WEB);
                data.get(i).setLink("http://fblitho.com");
            }
            else if (i%10 == 0)
                data.get(i).setDisplayType(LARGE_IMAGE);
            else if (i%3 == 0) {
                data.get(i).setDisplayType(THREE_IMAGES);
                String image = data.get(i).getImages()[0];
                data.get(i).setImages(new String[] {image, image, image});
            }
        }

        return data;
    }
}
