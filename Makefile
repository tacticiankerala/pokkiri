.PHONY: test

test:
	COAST_ENV=test clj -A\:test

clean:
	rm -rf resources/public/js/compiled
	rm -rf target

uberjar:
	
	clj -m coast.assets
	clj -A\:uberjar

repl:
	clj -R:repl bin/repl.clj

assets:
	clj -m coast.assets

server:
	clj -m app.server

db/migrate:
	clj -m coast.migrations migrate

db/rollback:
	clj -m coast.migrations rollback

db/create:
	clj -m coast.db create

db/drop:
	clj -m coast.db drop

cljs/watch:
	shadow-cljs watch app

cljs/release:
	shadow-cljs release app

release: | clean cljs/release assets uberjar
