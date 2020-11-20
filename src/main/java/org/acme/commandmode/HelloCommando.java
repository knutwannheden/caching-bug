package org.acme.commandmode;

import io.quarkus.cache.CacheResult;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class HelloCommando implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        final String name = args.length > 0 ? String.join(" ", args) : "commando";
        System.out.println("hello " + name);
        return 0;
    }

    @CacheResult(cacheName = "foo")
    public String foo(int i) {
        if (i % 2 == 0)
            return Integer.toString(i);
        throw new IllegalArgumentException("odd");
    }

}
