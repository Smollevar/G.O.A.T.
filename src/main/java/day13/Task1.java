package day13;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        User pasha = new User("Pasha");
        User sasha = new User("Sahsa");
        User masha = new User("Masha");
        pasha.sendMessage(sasha,"Hello, hellooo...");
        pasha.sendMessage(sasha,"I have a message for you... PRAY FOR DEATH!");
        sasha.sendMessage(pasha,"Well well well");
        sasha.sendMessage(pasha,"What have we here...");
        sasha.sendMessage(pasha,"Pew, just another upstart, get out of here, freak");
        masha.sendMessage(pasha,"Aw dude, do you think so?");
        masha.sendMessage(pasha,"You better run before we getting down there");
        masha.sendMessage(pasha,"Are you still there? Grr... *illegible*");
        pasha.sendMessage(masha,"YA, ama still hia you *****");
        pasha.sendMessage(masha,"An whaddyo doin to me ha?");
        pasha.sendMessage(masha,"NOTHING, COUSE IMMA ALREADY DEATH");
        sasha.sendMessage(pasha,"Well, its look like we trapped in another 'bad' film from john Carpenter... ");
        System.out.println(MessageDatabase.messages.toString());
    }
}
