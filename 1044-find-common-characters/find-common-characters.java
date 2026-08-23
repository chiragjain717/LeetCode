class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> mp = new HashMap<>();

     String u = words[0];

for(char c : u.toCharArray()) {
    mp.put(c, mp.getOrDefault(c, 0) + 1);
}

for(int i = 1; i < words.length; i++) {

    Map<Character,Integer> mp1 = new HashMap<>();
    String s = words[i];
    for(char c : s.toCharArray()) {
        mp1.put(c, mp1.getOrDefault(c, 0) + 1);
    }

    Map<Character,Integer> mp2 = new HashMap<>();
    for(var x : mp1.entrySet()) {

        if(mp.containsKey(x.getKey())) {

            int y = Math.min(
                mp.get(x.getKey()),
                mp1.get(x.getKey())
            );

            mp2.put(x.getKey(), y);
        }
    }

    mp = mp2;
}

List<String> list = new ArrayList<>();

for(var x : mp.entrySet()) {

    int y = x.getValue();

    while(y > 0) {
        list.add(String.valueOf(x.getKey()));
        y--;
    }
}

return list;
    }
}