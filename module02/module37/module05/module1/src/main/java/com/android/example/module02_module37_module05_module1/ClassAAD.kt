package com.android.example.module02_module37_module05_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module02_module37_module05_module3.ClassAAH = com.android.example.module02_module37_module05_module3.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module02_module37_module05_module3.ClassAAA = com.android.example.module02_module37_module05_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module02_module37_module05_module3.ClassAAI,
		param1: com.android.example.module02_module37_module05_module3.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onNext(kotlin.Any())

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.assertNotSubscribed()

			val local_var_3_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_3.isDisposed()

		}
	}

	fun method1(
		param0: com.android.example.module02_module37_module05_module3.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(8109389851086510524)

	}
}
