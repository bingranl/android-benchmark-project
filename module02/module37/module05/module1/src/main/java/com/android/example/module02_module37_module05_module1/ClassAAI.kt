package com.android.example.module02_module37_module05_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module02_module37_module05_module3.ClassAAD = com.android.example.module02_module37_module05_module3.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module02_module37_module05_module3.ClassAAB = com.android.example.module02_module37_module05_module3.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module02_module37_module05_module3.ClassAAJ = com.android.example.module02_module37_module05_module3.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module02_module37_module05_module3.ClassAAJ = com.android.example.module02_module37_module05_module3.ClassAAJ()
	private 	val instance_var_1_4: com.android.example.module02_module37_module05_module3.ClassAAJ = com.android.example.module02_module37_module05_module3.ClassAAJ()

	fun method0(
		param0: com.android.example.module02_module37_module05_module3.ClassAAB
	) {
		param0.method1("SomeString", "SomeString")

		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

			local_var_3_0.onComplete()

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(-3948798301728102904)

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

	}

	fun method1(
		param0: com.android.example.module02_module37_module05_module3.ClassAAI,
		param1: com.android.example.module02_module37_module05_module3.ClassAAB,
		param2: com.android.example.module02_module37_module05_module3.ClassAAJ,
		param3: com.android.example.module02_module37_module05_module3.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		param0.method1("SomeString")

		val local_var_2_5: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_5.onSuccess(kotlin.Any())

	}
}
