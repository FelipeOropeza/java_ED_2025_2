import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagMatcher {

    public static boolean isHtmlBalanced(String html) {
        Stack<String> pilha = new Stack<>();
        Pattern pattern = Pattern.compile("</?[^>]+>");
        Matcher matcher = pattern.matcher(html);
        // <conteudo> </conteudo>
        while (matcher.find()) {
            // <body> </body> <h1> </h1>
            String tagCompleta = matcher.group();

            // body /body h1 /h1
            String tagConteudo = tagCompleta.substring(1, tagCompleta.length() - 1).trim();

            if (tagConteudo.endsWith("/")) {
                continue;
            }

            // Se a tag for de abertura armazena na pilha exe: body
            if (!tagConteudo.startsWith("/")) {
                String tagNome = tagConteudo.split("\\s+")[0];
                pilha.push(tagNome);
            } 
            // Se a tag for de fechamento, quer dizer que a mesma já foi armazenado na pilha e
            // vai achar seu par correspondente exe /body body
            else {
                String tagNome = tagConteudo.substring(1);
                if (pilha.isEmpty() || !pilha.pop().equals(tagNome)) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String html = "<body>\n" +
                "<center>\n" +
                "<h1> The Little Boat </h1>\n" +
                "</center>\n" +
                "<p> Some paragraph </p>\n" +
                "</body>";

        boolean resultado = isHtmlBalanced(html);
        System.out.println("Tags balanceadas? " + resultado);
    }
}
