# Secret Message
 > This program encodes and decodes your messages! But how does it work?

# How does it work?
![example](https://user-images.githubusercontent.com/99100535/221380207-6837c4b3-7599-406a-a7cb-fc75864ea48e.png)

- At **1** it asks the message we wants to encode in example it is "coding is fun"
- At **2** it asks us what the secret key value it should be  
  - As example we said 13 so it adds the key value to each character in the message. <br/> 
    For example **s** becomes **f** because **f** is 13 letters further in the alphabet then **s**. <br/>
    *(If the number goes oever 26 it wraps around the alphabet)*
- And at **3** it shows us the encoded message.

# But how do i decode it?
Well you decode it the same as you encode it, but you just put the encoded message first. Like this: <br/> <br/> 
![example2](https://user-images.githubusercontent.com/99100535/221380610-8dacaaa1-61fe-4ec3-a637-50c7e8db287f.png)

We just put the encoded message at **1** and gave the negative key value in from the previous example. <br/>
***if you put a negative key value first then you put the positive keyvalue there.***


