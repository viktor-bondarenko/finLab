from flask import Flask, json, render_template, url_for

app = Flask(__name__, static_url_path='')

@app.route("/", methods=['GET'])
def root():
    return app.send_static_file('index.html')


@app.route("/record", methods=['GET'])
def get_records():
    f = open("data/records.json", "r")
    data = f.read()
    return data

if __name__ == '__main__':
    app.run(port=5002)
