package com.jredthree.okhttptest;

import java.util.List;

/**
 * author: smart
 * time: 2016/11/16
 */

public class MovieBean {

    /**
     * max : 10
     * average : 4.5
     * stars : 25
     * min : 0
     */

    private RatingBean rating;
    /**
     * rating : {"max":10,"average":4.5,"stars":"25","min":0}
     * reviews_count : 10
     * wish_count : 102
     * douban_site :
     * year : 2016
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2392784794.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2392784794.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2392784794.jpg"}
     * alt : https://movie.douban.com/subject/26880771/
     * id : 26880771
     * mobile_url : https://movie.douban.com/subject/26880771/mobile
     * title : 枕边有张脸2
     * do_count : null
     * share_url : https://m.douban.com/movie/subject/26880771
     * seasons_count : null
     * schedule_url : https://movie.douban.com/subject/26880771/cinema/
     * episodes_count : null
     * countries : ["中国大陆"]
     * genres : ["悬疑","惊悚"]
     * collect_count : 365
     * casts : [{"alt":"https://movie.douban.com/celebrity/1353049/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1448537867.92.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1448537867.92.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1448537867.92.jpg"},"name":"赵慧仙","id":"1353049"},{"alt":"https://movie.douban.com/celebrity/1363788/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"田家大","id":"1363788"},{"alt":"https://movie.douban.com/celebrity/1363789/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1477653393.04.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1477653393.04.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1477653393.04.jpg"},"name":"胡睿","id":"1363789"},{"alt":"https://movie.douban.com/celebrity/1363790/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"陈野","id":"1363790"}]
     * current_season : null
     * original_title : 枕边有张脸2
     * summary : 溪田（赵慧仙 饰）十几年来被一个噩梦所困扰，偶然中从著名画家陈风的画中看到了在梦里想杀自己的女孩。为了解梦，溪田一行五人决定去存放着这幅画真迹的深山别墅去寻找答案。没等解开答案，五人却遭遇了一系列离奇古怪的恐怖事件：离奇古怪的女主人、房间里不断传来的哭声、同行的人不断失踪遇害、枕边女鬼忽隐忽现……
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1323628/","avatars":{"small":"https://img5.doubanio.com/img/celebrity/small/1435833583.66.jpg","large":"https://img5.doubanio.com/img/celebrity/large/1435833583.66.jpg","medium":"https://img5.doubanio.com/img/celebrity/medium/1435833583.66.jpg"},"name":"赵小溪","id":"1323628"}]
     * comments_count : 269
     * ratings_count : 352
     * aka : []
     */

    private int reviews_count;
    private int wish_count;
    private String douban_site;
    private String year;
    /**
     * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2392784794.jpg
     * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2392784794.jpg
     * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2392784794.jpg
     */

    private ImagesBean images;
    private String alt;
    private String id;
    private String mobile_url;
    private String title;
    private Object do_count;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private Object episodes_count;
    private int collect_count;
    private Object current_season;
    private String original_title;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<String> countries;
    private List<String> genres;
    /**
     * alt : https://movie.douban.com/celebrity/1353049/
     * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/1448537867.92.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1448537867.92.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1448537867.92.jpg"}
     * name : 赵慧仙
     * id : 1353049
     */

    private List<CastsBean> casts;
    /**
     * alt : https://movie.douban.com/celebrity/1323628/
     * avatars : {"small":"https://img5.doubanio.com/img/celebrity/small/1435833583.66.jpg","large":"https://img5.doubanio.com/img/celebrity/large/1435833583.66.jpg","medium":"https://img5.doubanio.com/img/celebrity/medium/1435833583.66.jpg"}
     * name : 赵小溪
     * id : 1323628
     */

    private List<DirectorsBean> directors;
    private List<?> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<?> getAka() {
        return aka;
    }

    public void setAka(List<?> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        private String alt;
        /**
         * small : https://img3.doubanio.com/img/celebrity/small/1448537867.92.jpg
         * large : https://img3.doubanio.com/img/celebrity/large/1448537867.92.jpg
         * medium : https://img3.doubanio.com/img/celebrity/medium/1448537867.92.jpg
         */

        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        private String alt;
        /**
         * small : https://img5.doubanio.com/img/celebrity/small/1435833583.66.jpg
         * large : https://img5.doubanio.com/img/celebrity/large/1435833583.66.jpg
         * medium : https://img5.doubanio.com/img/celebrity/medium/1435833583.66.jpg
         */

        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
