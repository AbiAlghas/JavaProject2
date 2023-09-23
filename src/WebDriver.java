import java.sql.Driver;

interface WebDriver {
    void open();

    void close();

    String getTitle();

    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }

    interface TakeScreenShot extends RemoteWebDriver {
        void getScreenshot();
    }

    class ChromeDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {return null;}

        @Override
        public void navigate() {
        }
    }

    class FirefoxDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {return null;}

        @Override
        public void navigate() {
        }
    }

    class SafariDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {return null;}

        @Override
        public void navigate() {
        }
    }

    class tester {
        public static void main(String[] args) {
            ChromeDriver c = new ChromeDriver();
            c.open();
            c.close();
            c.navigate();
            c.getTitle();

            FirefoxDriver f = new FirefoxDriver();
            f.open();
            f.close();
            f.navigate();
            f.getTitle();

            SafariDriver s = new SafariDriver();
            s.open();
            s.close();
            s.navigate();
            s.getTitle();

        }
    }
}
