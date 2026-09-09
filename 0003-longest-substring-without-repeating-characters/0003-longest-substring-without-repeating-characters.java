class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int hash[] = new int[256];
        Arrays.fill(hash,-1);

        int l =0;
        int r =0;
        int maxlen = 0;
        while(r<n){
            if(hash[s.charAt(r)] != -1){   // in the map

            if(hash[s.charAt(r)]>=l){   // with in the range
             l = hash[s.charAt(r)] + 1;  // curr char pehle kb mila tha
            }
            }
            int len = r-l+1; // length
            maxlen = Math.max(maxlen,len);
            hash[s.charAt(r)] = r; // curr index store
            r++;
        }
        return maxlen;
    }
}