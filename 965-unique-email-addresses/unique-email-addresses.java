class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String name = parts[0];
            String domain = parts[1];

            name = name.split("\\+")[0];
            name = name.replace(".", "");

            set.add(name + "@" + domain);
        }

        return set.size();
    }
}