from flask import Flask, json

app = Flask(__name__)


@app.route("/record", methods=['GET'])
def get_records():
    f = open("data/records.json", "r")
    data = f.read()
    return data

if __name__ == '__main__':
    app.run(port=5002)