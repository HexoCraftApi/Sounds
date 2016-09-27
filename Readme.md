#Sounds

Sounds define all the sounds existing from 1.7.10 to 1.10.2

With it you can get any sound without crashing you plugin whenever you upgrade your server.

To use it just get a sound by it's name :

```
    Sound sound = Sounds.get("BLOCK_ANVIL_BREAK");
```

The above code return BLOCK_ANVIL_BREAK if your server is in 1.10 but returns ANVIL_BREAK in 1.7.10


## PlaySounds
Have a look at the PlaySounds class, you'll find a bunch of useful function to play any sounds in game.