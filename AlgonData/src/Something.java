import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Something {
    public static String doSomething(String input){
        Map<Character, Integer> table = new HashMap<>();

        char[] array = input.toCharArray();
        int left = 0;
        int right = 1;

        while(right < array.length -1){
           while(right < array.length && Character.isDigit(array[right])){
               right++;
           }
           table.put(array[left], table.getOrDefault(array[left], 0) +
                   Integer.valueOf(input.substring(left + 1, right)));
           left = right;
           right = right + 1;
        }
        if (left < array.length)
            table.put(array[left], table.getOrDefault(array[left], 0) +
                Integer.valueOf(input.substring(left + 1)));
        StringJoiner joiner = new StringJoiner("");
       return table.entrySet().stream()
                .map(entry -> entry.getKey() + String.valueOf(entry.getValue()))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "w959u772y561m752e504p802f81w275v414w26e784o118y551e196b512c667w594x566c743z353f142i201t128t788s626p518u843t975z374o912v55n930j190e357c861a593a117a868w940m902z617t672s672h46k241s454n351n564e534b828t532k517g516g602l662f325s937l16m217f974h721b170j828k729p385f950s47q667v521i992c259r745m719i826z690i15x919k30o728a755o397d84c866v253i877t676x711p193k748j300h716b580t165p502t290o34a90s218g39v339i322x497v789b988t236a685l785e668z616b977h826r632b699k640q504r766z108m366v455o451h833k142o978n901j466p623p318c49k30z709r658l753q622r997d931g556t313z428e445z199e857i304x915l767h922j753s720q411n670j944x432y817h972v371u892p834k178q684s490t435x905k892m523w891s814t128z785l871b582j803m333u760p378q11r151f942g721l113j957w153o15o919s102v822v502z962b511i806h138d97b422x519g490g55d644z251h416g495f759u93m715o61o369z848w788p235i572u876d872n294b472m765j631s81b343o383o829d576c1u948k88f734u262o401a779h424c15v663l611z219a56p556p535l322t227j460p715n880s101f286";
        System.out.println(input.length());
        System.out.println(doSomething(input));
    }
}
