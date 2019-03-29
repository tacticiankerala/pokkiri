# pokkiri

## Pre-requisite
- node (>6)
- shadow-cljs
- clj

## Start

```bash
git clone git@github.com:tacticiankerala/pokkiri.git
cd pokkiri
make db/create
make db/migrate
```

## Dev

```bash
make repl # starts an nrepl server
```

```clojure
; in your editor, connect to the nrepl server
; in atom with proto-repl, it's Ctrl+Cmd+Y then enter
; then when you're in the repl evaluate -main
(-main)
```

```bash
curl http://localhost:1337 # or just open it in your browser
```

## Ship

```bash
make release
java -jar target/pokkiri.jar -m server 1337
```
note: use an appropriate `.env` file.
