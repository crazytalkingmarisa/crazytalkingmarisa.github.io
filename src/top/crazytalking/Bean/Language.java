package top.crazytalking.Bean;

/**
 * 1 = english
 * 2 = 中文
 */

public class Language {

    /**
     * navigator : {"title":"玛丽莎 | 中文老师","item":{"home":"首页","course":"课程","other_services":"其他服务","sign_up_contact":"报名 | 联系我们"}}
     * slide : {"page1":{"p1":"属于你的中文老师在微信或者<br/>Skype上为你进行一对一教学","p2":"获取你自己的在线中文导师。 <br/>适合个人、企业，<br/>还有孩子们","button1":"联系我们"},"page2":{"p1":"在广州任何时间都可以上中文课","p2":"我们为广州的学生提供家庭教育","button1":"联系我们"}}
     * aboutUs : {"title":"简介","p1":"玛丽莎中文学校成立于2016年，是一家国际化的中文学校，秉持教学质量第一，致力为全球各地的外国友人提供最专业，最满意的中文教学服务，本着\u201c用心服务，传递中华文化\u201d为宗旨，主要教育服务有外国人普通话一对一及小班语言培训以及法语，西班牙语，德语，俄语等小语种培训。","p2":"我们拥有专业强大的师资，有来自世界各地的母语为英语，德语，法语，西班牙语等外籍教师，以及来自中国重点大学汉语国际教育专业，西班牙语专业，法语专业，日语专业等毕业的教师，还有一批具有出国教学经验的优秀中文教师。目前学生有来自广州各领事馆，外资企业商务人士，模特，艺术家，外教等等。"}
     * comment : {"title":"学生的评价"}
     * course : {"title":"课程","item1":{"title":"HSK考试辅导","content":"1.HSK应试技巧<br/>2.语法结构<br/>3.听、说、读、写练习分类<br/>4.模拟测试"},"item2":{"title":"初级汉语","content":"1.拼音介绍<br/>2.读写汉字<br/>3.生存汉语<br/>4.社会汉语"},"item3":{"title":"中级汉语","content":"1.普通话对话<\/br> 2.口语技巧<\/br> 3.更多汉字学习 <\/br>"},"item4":{"title":"高级汉语","content":"1.汉语成语及谚语<\/br> 2.阅读<\/br>"},"item5":{"title":"小语种学习课程","content":"1.日常口语交流<\/br> 2.商务口语学习<\/br> 3.短期速成，针对团体或个人出国旅行，留学，出差等中国人群体"},"item6":{"title":"成人英语培训","content":"助力商场的朋友成功与外国朋友完成交易，让成人也能自信的讲英语，轻松的做生意。"}}
     * service : {"title":"其他服务","lead":"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们提供协助外国人来中国住宿，办理签证，注册公司，租赁办公室，安排机场接待，网络购物, 专业翻译等服务。","item1":"中国旅游","item2":"机场接待","item3":"住宿服务","item4":"办理签证","item5":"注册公司","item6":"租赁办公室"}
     * contact : {"title":"联系方式","address":"广州天河体育西路189号城建大厦25楼A区欧西商务中心","form":{"name":"你的名字","email":"你的邮箱地址","tel":"你的电话号码","need":"告诉我们你想要什么","btn":"发送消息","response":{"title":"谢谢，很快我们将联系你","link":"返回首页"}}}
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
         * title : 玛丽莎 | 中文老师
         * item : {"home":"首页","course":"课程","other_services":"其他服务","sign_up_contact":"报名 | 联系我们"}
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
             * home : 首页
             * course : 课程
             * other_services : 其他服务
             * sign_up_contact : 报名 | 联系我们
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
         * page1 : {"p1":"属于你的中文老师在微信或者<br/>Skype上为你进行一对一教学","p2":"获取你自己的在线中文导师。 <br/>适合个人、企业，<br/>还有孩子们","button1":"联系我们"}
         * page2 : {"p1":"在广州任何时间都可以上中文课","p2":"我们为广州的学生提供家庭教育","button1":"联系我们"}
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
             * p1 : 属于你的中文老师在微信或者<br/>Skype上为你进行一对一教学
             * p2 : 获取你自己的在线中文导师。 <br/>适合个人、企业，<br/>还有孩子们
             * button1 : 联系我们
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
             * p1 : 在广州任何时间都可以上中文课
             * p2 : 我们为广州的学生提供家庭教育
             * button1 : 联系我们
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
         * title : 简介
         * p1 : 玛丽莎中文学校成立于2016年，是一家国际化的中文学校，秉持教学质量第一，致力为全球各地的外国友人提供最专业，最满意的中文教学服务，本着“用心服务，传递中华文化”为宗旨，主要教育服务有外国人普通话一对一及小班语言培训以及法语，西班牙语，德语，俄语等小语种培训。
         * p2 : 我们拥有专业强大的师资，有来自世界各地的母语为英语，德语，法语，西班牙语等外籍教师，以及来自中国重点大学汉语国际教育专业，西班牙语专业，法语专业，日语专业等毕业的教师，还有一批具有出国教学经验的优秀中文教师。目前学生有来自广州各领事馆，外资企业商务人士，模特，艺术家，外教等等。
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
         * title : 学生的评价
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
         * title : 课程
         * item1 : {"title":"HSK考试辅导","content":"1.HSK应试技巧<br/>2.语法结构<br/>3.听、说、读、写练习分类<br/>4.模拟测试"}
         * item2 : {"title":"初级汉语","content":"1.拼音介绍<br/>2.读写汉字<br/>3.生存汉语<br/>4.社会汉语"}
         * item3 : {"title":"中级汉语","content":"1.普通话对话<\/br> 2.口语技巧<\/br> 3.更多汉字学习 <\/br>"}
         * item4 : {"title":"高级汉语","content":"1.汉语成语及谚语<\/br> 2.阅读<\/br>"}
         * item5 : {"title":"小语种学习课程","content":"1.日常口语交流<\/br> 2.商务口语学习<\/br> 3.短期速成，针对团体或个人出国旅行，留学，出差等中国人群体"}
         * item6 : {"title":"成人英语培训","content":"助力商场的朋友成功与外国朋友完成交易，让成人也能自信的讲英语，轻松的做生意。"}
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
             * title : HSK考试辅导
             * content : 1.HSK应试技巧<br/>2.语法结构<br/>3.听、说、读、写练习分类<br/>4.模拟测试
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
             * title : 初级汉语
             * content : 1.拼音介绍<br/>2.读写汉字<br/>3.生存汉语<br/>4.社会汉语
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
             * title : 中级汉语
             * content : 1.普通话对话</br> 2.口语技巧</br> 3.更多汉字学习 </br>
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
             * title : 高级汉语
             * content : 1.汉语成语及谚语</br> 2.阅读</br>
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
             * title : 小语种学习课程
             * content : 1.日常口语交流</br> 2.商务口语学习</br> 3.短期速成，针对团体或个人出国旅行，留学，出差等中国人群体
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
             * title : 成人英语培训
             * content : 助力商场的朋友成功与外国朋友完成交易，让成人也能自信的讲英语，轻松的做生意。
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
         * title : 其他服务
         * lead : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们提供协助外国人来中国住宿，办理签证，注册公司，租赁办公室，安排机场接待，网络购物, 专业翻译等服务。
         * item1 : 中国旅游
         * item2 : 机场接待
         * item3 : 住宿服务
         * item4 : 办理签证
         * item5 : 注册公司
         * item6 : 租赁办公室
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
         * title : 联系方式
         * address : 广州天河体育西路189号城建大厦25楼A区欧西商务中心
         * form : {"name":"你的名字","email":"你的邮箱地址","tel":"你的电话号码","need":"告诉我们你想要什么","btn":"发送消息","response":{"title":"谢谢，很快我们将联系你","link":"返回首页"}}
         */

        private String title;
        private String address;
        private Form form;

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

        public Form getForm() {
            return form;
        }

        public void setForm(Form form) {
            this.form = form;
        }

        public static class Form {
            /**
             * name : 你的名字
             * email : 你的邮箱地址
             * tel : 你的电话号码
             * need : 告诉我们你想要什么
             * btn : 发送消息
             * response : {"title":"谢谢，很快我们将联系你","link":"返回首页"}
             */

            private String name;
            private String email;
            private String tel;
            private String need;
            private String btn;
            private Response response;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getNeed() {
                return need;
            }

            public void setNeed(String need) {
                this.need = need;
            }

            public String getBtn() {
                return btn;
            }

            public void setBtn(String btn) {
                this.btn = btn;
            }

            public Response getResponse() {
                return response;
            }

            public void setResponse(Response response) {
                this.response = response;
            }

            public static class Response {
                /**
                 * title : 谢谢，很快我们将联系你
                 * link : 返回首页
                 */

                private String title;
                private String link;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }
            }
        }
    }
}
