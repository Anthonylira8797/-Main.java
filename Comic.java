public class Comic {
/*
 *  writer: String
 *  illustrator : String
 *  colorist : String
 *  title : String
 *  issueNum : int
 */

    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;


    //CONSTRUCTORS
    public Comic(String writer, String illustrator, String colorist, String title, int issueNum) {
        this.setWriter(writer);
        this.setIllustrator(illustrator);
        this.setColorist(colorist);
        this.setTitle(title);
        this.setIssueNum(issueNum);

    }


    //MUTATORS+ACCESSORS

    //SETTERS
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }
        
    public void setColorist(String colorist) {
        this.colorist = colorist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    //GETTERS

    public String getWriter() {
        return writer;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public String getColorist() {
        return colorist;
    }

    public String getTitle() {
        return title;
    }

    public int issueNum() {
        return issueNum;
    }


     @Override
     public String toString() {
         return "Comic{" +
                 "illustrator='" + illustrator + '\'' +
                 ", writer='" + writer + '\'' +
                 ", colorist='" + colorist + '\'' +
                 ", title='" + title + '\'' +
                 ", issueNum='" + issueNum +
                 '}';

     }

     public boolean equals(Comic otherComic) {

         if (otherComic == null) {
            return false;
        }




        return this.title.equals(otherComic.getTitle()) &&
               this.issueNum == otherComic.issueNum() &&
               this.writer.equals(otherComic.getWriter()) &&
               this.illustrator.equals(otherComic.getIllustrator()) &&
               this.colorist.equals(otherComic.getColorist());
     }

    }
