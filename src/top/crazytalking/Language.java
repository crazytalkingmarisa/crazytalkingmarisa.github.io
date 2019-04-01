package top.crazytalking;


public class Language {


    /**
     * navigator : {"title":"Marisa | Chinese Teacher","item":{"Home":"Home","Course":"Course","other_services":"Other Services","sign_up_contact":"Sign up | Contact"}}
     * slide : {"page1":{"p1":"Take 1 on 1 lessons with<br/>a private Chinese teacher<br/>on Wechat or Skype","p2":"Get your own personal online Chinese teacher. <br/>reat for individuals, businesses,<br/>and children.","button1":"CONTACT US"},"page2":{"p1":"Take Your Chinese Lessons Any<br/>Time Anywhere in GuangZhou","p2":"We provide family teach for student<br/>in GuangZhou","button1":"CONTACT US"}}
     * aboutUs : {"title":"Who we are?","p1":"Marisa Global Chinese school locates in Guangzhou ,which established in 2016, It upholds the principle of teaching quality first and strives to provide the most professional and satisfactory Chinese teaching service to foreigners all over the world. In line with the purpose of \"serving with heart and transmitting Chinese culture\", the main educational services include one-to-one Mandarin training for foreigners and small class language training, as well as French, Spanish, German, Russian and other small language training.","p2":"We have professional and powerful teachers, foreign teachers from all over the world who are native speakers of English, German, French, Spanish, etc., as well as teachers from Chinese majors such as Chinese International Education, Spanish, French, and Japanese. There are also a number of outstanding Chinese teachers with experience in teaching abroad. At present, students come from consulates in Guangzhou, foreign-funded business people, models, artists, foreign teachers and so on."}
     * comment : {"title":"What our students say about us?"}
     * course : {"title":"course","item1":{"title":"HSK exam tutor","content":"1.HSK test-taking skills<br/>2.Grammartical structure<br/>3.Classification of listening,speaking,reading and writing practice<br/>4.Simulation test"},"item2":{"title":"Beginner Chinese","content":"1.Introduction to pinyin<br/>2.Read and write Chinese characters<br/>3.Survival Chinese<br/>4.Social Chinese"},"item3":{"title":"Intermediate Chinese","content":"1.Conversational Chinese<br/>2.Interview skills<br/>3.Chinese Characters expansion "},"item4":{"title":"Advanced Chinese","content":"1.Chinese Idioms&proverbs<br/>2.Noval Reading"},"item5":{"title":"Minority Language Course","content":"1.Training in Japanese, Korean, French, Spanish and other minor languages<br/>2.Daily oral communication<br/>3.Business Chinese<br/>4.Short-term quick, for groups or individuals to travel abroad, study abroad, travel and other Chinese groups"},"item6":{"title":"Adult English Training","content":"Help the friends in business to successfully complete the transaction with foreign friends. Make adults can speak English confidently and do business easily."}}
     * service : {"title":"Services","lead":"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;We also provide one-to-one distance learning services, free assistance to foreigners to China accommodation services, visa processing, registration companies, rental offices, airport reception, online shopping and other life services. At the same time, its translation company, Guangzhou Alpha Translation Service Co., Ltd., was founded by the youngest diplomat of Israel, Mr. Youda, and provides document translation services for embassies and Chinese and foreign companies.","item1":"Travel In China","item2":"Airport Reception","item3":"Residential Services","item4":"Visa Application","item5":"Company Register","item6":"Office Rented"}
     * contact : {"title":"Contact","address":"Room 25B-2521, No. 189 Tiyuxi Road, Tianhe District, Guangzhou"}
     */

    private Navigator navigator;
    private Slide slide;
    private AboutUs aboutUs;
    private Comment comment;
    private Course course;
    private Service service;
    private Contact contact;

    public Navigator getNavigator() {
        return navigator;
    }

    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

    public Slide getSlide() {
        return slide;
    }

    public void setSlide(Slide slide) {
        this.slide = slide;
    }

    public AboutUs getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(AboutUs aboutUs) {
        this.aboutUs = aboutUs;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public static class Navigator {
        /**
         * title : Marisa | Chinese Teacher
         * item : {"Home":"Home","Course":"Course","other_services":"Other Services","sign_up_contact":"Sign up | Contact"}
         */

        private String title;
        private Item item;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public static class Item {
            /**
             * Home : Home
             * Course : Course
             * other_services : Other Services
             * sign_up_contact : Sign up | Contact
             */

            private String home;
            private String course;
            private String other_services;
            private String sign_up_contact;

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getCourse() {
                return course;
            }

            public void setCourse(String course) {
                this.course = course;
            }

            public String getOther_services() {
                return other_services;
            }

            public void setOther_services(String other_services) {
                this.other_services = other_services;
            }

            public String getSign_up_contact() {
                return sign_up_contact;
            }

            public void setSign_up_contact(String sign_up_contact) {
                this.sign_up_contact = sign_up_contact;
            }
        }
    }

    public static class Slide {
        /**
         * page1 : {"p1":"Take 1 on 1 lessons with<br/>a private Chinese teacher<br/>on Wechat or Skype","p2":"Get your own personal online Chinese teacher. <br/>reat for individuals, businesses,<br/>and children.","button1":"CONTACT US"}
         * page2 : {"p1":"Take Your Chinese Lessons Any<br/>Time Anywhere in GuangZhou","p2":"We provide family teach for student<br/>in GuangZhou","button1":"CONTACT US"}
         */

        private Page1 page1;
        private Page2 page2;

        public Page1 getPage1() {
            return page1;
        }

        public void setPage1(Page1 page1) {
            this.page1 = page1;
        }

        public Page2 getPage2() {
            return page2;
        }

        public void setPage2(Page2 page2) {
            this.page2 = page2;
        }

        public static class Page1 {
            /**
             * p1 : Take 1 on 1 lessons with<br/>a private Chinese teacher<br/>on Wechat or Skype
             * p2 : Get your own personal online Chinese teacher. <br/>reat for individuals, businesses,<br/>and children.
             * button1 : CONTACT US
             */

            private String p1;
            private String p2;
            private String button1;

            public String getP1() {
                return p1;
            }

            public void setP1(String p1) {
                this.p1 = p1;
            }

            public String getP2() {
                return p2;
            }

            public void setP2(String p2) {
                this.p2 = p2;
            }

            public String getButton1() {
                return button1;
            }

            public void setButton1(String button1) {
                this.button1 = button1;
            }
        }

        public static class Page2 {
            /**
             * p1 : Take Your Chinese Lessons Any<br/>Time Anywhere in GuangZhou
             * p2 : We provide family teach for student<br/>in GuangZhou
             * button1 : CONTACT US
             */

            private String p1;
            private String p2;
            private String button1;

            public String getP1() {
                return p1;
            }

            public void setP1(String p1) {
                this.p1 = p1;
            }

            public String getP2() {
                return p2;
            }

            public void setP2(String p2) {
                this.p2 = p2;
            }

            public String getButton1() {
                return button1;
            }

            public void setButton1(String button1) {
                this.button1 = button1;
            }
        }
    }

    public static class AboutUs {
        /**
         * title : Who we are?
         * p1 : Marisa Global Chinese school locates in Guangzhou ,which established in 2016, It upholds the principle of teaching quality first and strives to provide the most professional and satisfactory Chinese teaching service to foreigners all over the world. In line with the purpose of "serving with heart and transmitting Chinese culture", the main educational services include one-to-one Mandarin training for foreigners and small class language training, as well as French, Spanish, German, Russian and other small language training.
         * p2 : We have professional and powerful teachers, foreign teachers from all over the world who are native speakers of English, German, French, Spanish, etc., as well as teachers from Chinese majors such as Chinese International Education, Spanish, French, and Japanese. There are also a number of outstanding Chinese teachers with experience in teaching abroad. At present, students come from consulates in Guangzhou, foreign-funded business people, models, artists, foreign teachers and so on.
         */

        private String title;
        private String p1;
        private String p2;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getP1() {
            return p1;
        }

        public void setP1(String p1) {
            this.p1 = p1;
        }

        public String getP2() {
            return p2;
        }

        public void setP2(String p2) {
            this.p2 = p2;
        }
    }

    public static class Comment {
        /**
         * title : What our students say about us?
         */

        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class Course {
        /**
         * title : course
         * item1 : {"title":"HSK exam tutor","content":"1.HSK test-taking skills<br/>2.Grammartical structure<br/>3.Classification of listening,speaking,reading and writing practice<br/>4.Simulation test"}
         * item2 : {"title":"Beginner Chinese","content":"1.Introduction to pinyin<br/>2.Read and write Chinese characters<br/>3.Survival Chinese<br/>4.Social Chinese"}
         * item3 : {"title":"Intermediate Chinese","content":"1.Conversational Chinese<br/>2.Interview skills<br/>3.Chinese Characters expansion "}
         * item4 : {"title":"Advanced Chinese","content":"1.Chinese Idioms&proverbs<br/>2.Noval Reading"}
         * item5 : {"title":"Minority Language Course","content":"1.Training in Japanese, Korean, French, Spanish and other minor languages<br/>2.Daily oral communication<br/>3.Business Chinese<br/>4.Short-term quick, for groups or individuals to travel abroad, study abroad, travel and other Chinese groups"}
         * item6 : {"title":"Adult English Training","content":"Help the friends in business to successfully complete the transaction with foreign friends. Make adults can speak English confidently and do business easily."}
         */

        private String title;
        private Item1 item1;
        private Item2 item2;
        private Item3 item3;
        private Item4 item4;
        private Item5 item5;
        private Item6 item6;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Item1 getItem1() {
            return item1;
        }

        public void setItem1(Item1 item1) {
            this.item1 = item1;
        }

        public Item2 getItem2() {
            return item2;
        }

        public void setItem2(Item2 item2) {
            this.item2 = item2;
        }

        public Item3 getItem3() {
            return item3;
        }

        public void setItem3(Item3 item3) {
            this.item3 = item3;
        }

        public Item4 getItem4() {
            return item4;
        }

        public void setItem4(Item4 item4) {
            this.item4 = item4;
        }

        public Item5 getItem5() {
            return item5;
        }

        public void setItem5(Item5 item5) {
            this.item5 = item5;
        }

        public Item6 getItem6() {
            return item6;
        }

        public void setItem6(Item6 item6) {
            this.item6 = item6;
        }

        public static class Item1 {
            /**
             * title : HSK exam tutor
             * content : 1.HSK test-taking skills<br/>2.Grammartical structure<br/>3.Classification of listening,speaking,reading and writing practice<br/>4.Simulation test
             */

            private String title;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        public static class Item2 {
            /**
             * title : Beginner Chinese
             * content : 1.Introduction to pinyin<br/>2.Read and write Chinese characters<br/>3.Survival Chinese<br/>4.Social Chinese
             */

            private String title;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        public static class Item3 {
            /**
             * title : Intermediate Chinese
             * content : 1.Conversational Chinese<br/>2.Interview skills<br/>3.Chinese Characters expansion
             */

            private String title;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        public static class Item4 {
            /**
             * title : Advanced Chinese
             * content : 1.Chinese Idioms&proverbs<br/>2.Noval Reading
             */

            private String title;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        public static class Item5 {
            /**
             * title : Minority Language Course
             * content : 1.Training in Japanese, Korean, French, Spanish and other minor languages<br/>2.Daily oral communication<br/>3.Business Chinese<br/>4.Short-term quick, for groups or individuals to travel abroad, study abroad, travel and other Chinese groups
             */

            private String title;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        public static class Item6 {
            /**
             * title : Adult English Training
             * content : Help the friends in business to successfully complete the transaction with foreign friends. Make adults can speak English confidently and do business easily.
             */

            private String title;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }

    public static class Service {
        /**
         * title : Services
         * lead : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;We also provide one-to-one distance learning services, free assistance to foreigners to China accommodation services, visa processing, registration companies, rental offices, airport reception, online shopping and other life services. At the same time, its translation company, Guangzhou Alpha Translation Service Co., Ltd., was founded by the youngest diplomat of Israel, Mr. Youda, and provides document translation services for embassies and Chinese and foreign companies.
         * item1 : Travel In China
         * item2 : Airport Reception
         * item3 : Residential Services
         * item4 : Visa Application
         * item5 : Company Register
         * item6 : Office Rented
         */

        private String title;
        private String lead;
        private String item1;
        private String item2;
        private String item3;
        private String item4;
        private String item5;
        private String item6;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLead() {
            return lead;
        }

        public void setLead(String lead) {
            this.lead = lead;
        }

        public String getItem1() {
            return item1;
        }

        public void setItem1(String item1) {
            this.item1 = item1;
        }

        public String getItem2() {
            return item2;
        }

        public void setItem2(String item2) {
            this.item2 = item2;
        }

        public String getItem3() {
            return item3;
        }

        public void setItem3(String item3) {
            this.item3 = item3;
        }

        public String getItem4() {
            return item4;
        }

        public void setItem4(String item4) {
            this.item4 = item4;
        }

        public String getItem5() {
            return item5;
        }

        public void setItem5(String item5) {
            this.item5 = item5;
        }

        public String getItem6() {
            return item6;
        }

        public void setItem6(String item6) {
            this.item6 = item6;
        }
    }

    public static class Contact {
        /**
         * title : Contact
         * address : Room 25B-2521, No. 189 Tiyuxi Road, Tianhe District, Guangzhou
         */

        private String title;
        private String address;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
