package com.android.example.module07_module21_module02_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAE = com.android.example.module07_module21_module02_module1_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAH = com.android.example.module07_module21_module02_module1_module5.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAF = com.android.example.module07_module21_module02_module1_module5.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module07_module21_module02_module1_module5.ClassAAH = com.android.example.module07_module21_module02_module1_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAJ,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAE
	) {
		for (iAb in 0..3) {
			for (iAc in 0..3) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.onComplete()

				}
				param0.method0(io.reactivex.observers.TestObserver(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

				param0.method0(io.reactivex.observers.TestObserver(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

				param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable())

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
		param0.method0(io.reactivex.observers.TestObserver(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAG,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAF,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAC,
		param3: com.android.example.module07_module21_module02_module1_module5.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(-874766902337800273)

		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method2(io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAF,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAG
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(3801045167262196640)

	}
}
